package com.Teo.InventarioInicial.domain.usecase;

import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.ArticuloEntityMapper;
import com.Teo.InventarioInicial.domain.api.IArticuloServicePort;
import com.Teo.InventarioInicial.domain.model.Articulo;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;


import java.util.List;

public class ArticuloUseCase implements IArticuloServicePort {

    private final IArticuloPersistencePort articuloPersistencePort;
    private final ArticuloEntityMapper articuloEntityMapper;

    public ArticuloUseCase(IArticuloPersistencePort articuloPersistencePort, ArticuloEntityMapper articuloEntityMapper) {
        this.articuloPersistencePort = articuloPersistencePort;
        this.articuloEntityMapper = articuloEntityMapper;
    }

    @Override
    public List<Articulo> getAllArticulo() {
        return null;
    }

    @Override
    public void saveArticulo(Articulo articulo) {

    }

    @Override
    public void deleteArticulo(Articulo articulo) {

    }
    @Override
    public Articulo getArticulo(Long id) {
        return null;
    }
}
