package com.Teo.Inventario.domain.model;

public class InventarioInicial {



    private Long id;
    private String codigoArticulo;
    private String cantidad;
    private String ubicacion;

    private String Nombrealmacen;

    public InventarioInicial(Long id, String codigoArticulo, String cantidad, String ubicacion, String nombrealmacen) {
        this.id = id;
        this.codigoArticulo = codigoArticulo;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        Nombrealmacen = nombrealmacen;
    }
}
