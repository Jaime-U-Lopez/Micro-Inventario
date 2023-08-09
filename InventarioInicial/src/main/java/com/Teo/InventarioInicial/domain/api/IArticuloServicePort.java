package com.Teo.InventarioInicial.domain.api;

import com.Teo.InventarioInicial.domain.model.Articulo;

import java.util.List;

public interface IArticuloServicePort {


    List<Articulo> getAllArticulo();

    void saveArticulo(Articulo articulo);

    void deleteArticulo(Long id);

    Articulo getArticulo(Long id);

}
