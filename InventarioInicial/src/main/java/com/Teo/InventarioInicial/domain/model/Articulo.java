package com.Teo.InventarioInicial.domain.model;

public class Articulo {

    private Long id;
    private String nombreArticulo;
    private String codigoArticulo;
    private String ubicacion;
    private Almacen almacen;


    public Articulo(Long id, String nombreArticulo, String codigoArticulo, String ubicacion, Almacen almacen) {
        this.id = id;
        this.nombreArticulo = nombreArticulo;
        this.codigoArticulo = codigoArticulo;
        this.ubicacion = ubicacion;
        this.almacen = almacen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
}
