package com.Teo.Inventario.domain.usecase;

public class ConteoInventarioUseCase {

    private Long id;
    private String codigoArticulo;
    private String cantidad;
    private String ubicacion;

    public ConteoInventarioUseCase(Long id, String codigoArticulo, String cantidad, String ubicacion) {
        this.id = id;
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
