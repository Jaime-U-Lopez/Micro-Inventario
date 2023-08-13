package com.Teo.Inventario.domain.model;

public class ConteoInventario {

    private Long id;
    private String codigoArticulo;
    private String cantidad;
    private String ubicacion;



    public ConteoInventario(String codigoArticulo, String cantidad, String ubicacion) {
        this.codigoArticulo = codigoArticulo;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
