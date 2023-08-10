package com.Teo.Inventario.adapters.jpa.mysql.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@NoArgsConstructor
@Data
public class InventarioInicialEntity {


    private Long id;
    private String codigoArticulo;
    private String cantidad;
    private String ubicacion;
    private String AlmacenNombre;

}
