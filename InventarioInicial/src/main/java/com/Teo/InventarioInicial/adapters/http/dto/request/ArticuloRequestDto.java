package com.Teo.InventarioInicial.adapters.http.dto.request;


import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@NoArgsConstructor

@Getter
@Setter
public class ArticuloRequestDto {

    @NotBlank
    private String nombreArticulo;
    @NotBlank
    private String codigoArticulo;
    @NotBlank
    private String ubicacion;

    @NotNull
    @Positive(message = "El Id no puede ser negativo o cero (0)")
    private Long idAlmacen;

    public ArticuloRequestDto(String nombreArticulo, String codigoArticulo, String ubicacion, Long idAlmacen) {
        this.nombreArticulo = nombreArticulo;
        this.codigoArticulo = codigoArticulo;
        this.ubicacion = ubicacion;
        this.idAlmacen = idAlmacen;
    }
}
