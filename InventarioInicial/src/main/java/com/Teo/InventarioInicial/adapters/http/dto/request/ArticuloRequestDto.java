package com.Teo.InventarioInicial.adapters.http.dto.request;


import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@NoArgsConstructor

@Getter
@Setter
@Data
public class ArticuloRequestDto {

    @NotBlank
    private String nombreArticulo;
    @NotBlank
    private String codigoArticulo;
    @NotBlank
    private String ubicacion;
    @Positive(message = "La cantidad No puede ser negativo o cero (0)")
    private Integer cantidad;

    @NotNull
    @Positive(message = "El Id no puede ser negativo o cero (0)")
    private Long idAlmacen;

    public ArticuloRequestDto(String nombreArticulo, String codigoArticulo, String ubicacion, Integer cantidad, @NotNull Long idAlmacen) {
        this.nombreArticulo = nombreArticulo;
        this.codigoArticulo = codigoArticulo;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
        this.idAlmacen = idAlmacen;
    }
}
