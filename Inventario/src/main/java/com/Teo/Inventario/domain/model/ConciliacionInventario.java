package com.Teo.Inventario.domain.model;

public class ConciliacionInventario {


    private Long id;
    private GruposDeConteo gruposDeConteo;
    private ConteoInventario conteoInventario;
    private InventarioInicial inventarioInicial;

    public ConciliacionInventario(GruposDeConteo gruposDeConteo, ConteoInventario conteoInventario, InventarioInicial inventarioInicial) {
        this.gruposDeConteo = gruposDeConteo;
        this.conteoInventario = conteoInventario;
        this.inventarioInicial = inventarioInicial;
    }

    public GruposDeConteo getGruposDeConteo() {
        return gruposDeConteo;
    }

    public void setGruposDeConteo(GruposDeConteo gruposDeConteo) {
        this.gruposDeConteo = gruposDeConteo;
    }

    public ConteoInventario getConteoInventario() {
        return conteoInventario;
    }

    public void setConteoInventario(ConteoInventario conteoInventario) {
        this.conteoInventario = conteoInventario;
    }

    public InventarioInicial getInventarioInicial() {
        return inventarioInicial;
    }

    public void setInventarioInicial(InventarioInicial inventarioInicial) {
        this.inventarioInicial = inventarioInicial;
    }

}
