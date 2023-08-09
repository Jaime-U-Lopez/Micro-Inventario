package com.Teo.InventarioInicial.adapters.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
public class AlmacenResponseDto {

    private Long id;
    private String nombre;
    private String direccion;

    public AlmacenResponseDto(Long id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
