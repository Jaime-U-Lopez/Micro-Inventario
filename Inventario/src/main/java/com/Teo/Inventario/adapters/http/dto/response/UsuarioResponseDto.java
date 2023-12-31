package com.Teo.Inventario.adapters.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioResponseDto {
    private String nombre;
    private String apellido;
    private String correo;
    private String tipoNumeroDocumento;
    private String numeroDocumento;
    private String celular;
    private String fechaNacimiento;
}
