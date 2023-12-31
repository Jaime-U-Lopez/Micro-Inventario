package com.Teo.InventarioInicial.domain.spi;

import com.Teo.InventarioInicial.domain.model.Articulo;

import java.util.List;

public interface IArticuloPersistencePort {

    void save(Articulo articulo);
    void delete(Articulo articulo);
    Articulo getArticulo(Long id);
    List<Articulo> getAllArticulo();
}
