package com.Teo.InventarioInicial.adapters.http.dto.response;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public class ArticuloResponseDto {

    private Long id;

    private String nombreArticulo;

    private String codigoArticulo;

    private String ubicacion;

    private Integer cantidad;

    private AlmacenEntity almacen;

    public ArticuloResponseDto(Long id, String nombreArticulo, String codigoArticulo, String ubicacion, Integer cantidad, AlmacenEntity almacen) {
        this.id = id;
        this.nombreArticulo = nombreArticulo;
        this.codigoArticulo = codigoArticulo;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
        this.almacen = almacen;
    }
}


