package com.Teo.InventarioInicial.adapters.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class AlmacenResponseDto {
    private Long id;
    private String nombre;
    private String descripcion;
}
