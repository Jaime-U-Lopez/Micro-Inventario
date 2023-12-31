package com.Teo.Inventario.domain.usecase.validaciones;

import com.pragma.usuariomicroservice.adapters.http.dto.request.UsuarioRequestDto;
import com.pragma.usuariomicroservice.adapters.http.exceptions.FechaNacimientoMalFormatoException;
import com.pragma.usuariomicroservice.configuration.Constants;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
public class ValidacionesGenerales {

    protected UsuarioRequestDto usuarioRequestDto;
    protected static Pattern patron;
    protected static  Matcher matcher;
    protected  static String expresionRegular;
    protected  static boolean respuestaValidacion;

    public ValidacionesGenerales() {
    }

    public static void validarFechaNacimientoFormato(String fechaNacimiento){
        expresionRegular = "(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-(19|20)\\d{2}$|^(0[1-9]|[1-2][0-9])-02-(19|20)([02468][048]|[13579][26])$|^(0[1-9]|[1-2][0-9]|30)-(0[13-9]|1[0-2])-(19|20)\\d{2}$|^(0[1-9]|1[0-9]|2[0-8])-02-(19|20)\\d{2}$|^(31)-(0[13578]|1[02])-(19|20)\\d{2}$|^(29)-(02)-(19|20)([02468][1235679]|[13579][01345789])$";
        respuestaValidacion = ejecutarMatcher(fechaNacimiento);
        if(!respuestaValidacion){
            throw new FechaNacimientoMalFormatoException(Constants.FECHA_NACIMIENTO_MAL_FORMATO);
        }
        LocalDate fecha = stringToDate(fechaNacimiento);
        if(fecha.isAfter(LocalDate.now())){
            throw new FechaNacimientoMalFormatoException(Constants.FECHA_NACIMIENTO_NO_EXISTE);
        }
    }

    private  static boolean ejecutarMatcher(String validar){
        patron = Pattern.compile(expresionRegular);
        matcher = patron.matcher(validar);
        return matcher.find();
    }

    protected static LocalDate stringToDate(String fecha) throws DateTimeParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(fecha,formatter);
    }
}
