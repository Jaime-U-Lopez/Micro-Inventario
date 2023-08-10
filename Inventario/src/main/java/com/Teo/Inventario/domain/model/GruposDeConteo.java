package com.Teo.Inventario.domain.model;

public class GruposDeConteo {

    private long id;

    private String grupo;


    public GruposDeConteo(String grupo) {
        this.grupo = grupo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
