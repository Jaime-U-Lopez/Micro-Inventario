package com.Teo.InventarioInicial.domain.model;

public class Articulo {

    private Long id;
    private String nombreArticulo;
    private String codigoArticulo;
    private String ubicacion;
    private Integer cantidad;
    private Almacen almacen;

    public Articulo(String nombreArticulo, String codigoArticulo, String ubicacion, Integer cantidad, Almacen almacen) {
        this.nombreArticulo = nombreArticulo;
        this.codigoArticulo = codigoArticulo;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
}
