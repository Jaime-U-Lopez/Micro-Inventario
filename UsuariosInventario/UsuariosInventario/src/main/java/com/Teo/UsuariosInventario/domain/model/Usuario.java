package com.Teo.UsuariosInventario.domain.model;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private Long id;
    private Persona persona;
    private String nombreUsuario;
    private String departamento;
    private String estado;
    private String grupo;
    private Rol rol;
    private String almacen;
   private Set<Rol> roles = new HashSet<>();

    public Usuario(Long id, Persona persona, String nombreUsuario, String departamento, String estado, String grupo, Rol rol, String almacen, Set<Rol> roles) {
        this.id = id;
        this.persona = persona;
        this.nombreUsuario = nombreUsuario;
        this.departamento = departamento;
        this.estado = estado;
        this.grupo = grupo;
        this.rol = rol;
        this.almacen = almacen;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
}




