package com.Teo.InventarioInicial.domain.api;

import com.Teo.InventarioInicial.domain.model.Articulo;

import java.util.List;

public interface IArticuloServicePort {


    List<Articulo> getAllArticulo();

    void saveArticulo(Articulo articulo);

    void deleteArticulo(Articulo articulo);

    Articulo getArticulo(Long id);

}
