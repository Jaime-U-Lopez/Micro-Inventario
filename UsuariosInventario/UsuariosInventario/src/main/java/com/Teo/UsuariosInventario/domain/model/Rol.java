package com.pragma.usuariomicroservice.domain.model;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;

public class Rol {
    private Long id;
    private RolNombre nombreRol;
    private String descripcion;

    public Rol() {
    }

    public Rol(Long id, RolNombre nombreRol, String descripcion) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RolNombre getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(RolNombre tipoRol) {
        this.nombreRol = tipoRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
