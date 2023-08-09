package com.Teo.InventarioInicial.domain.usecase;

import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.ArticuloEntityMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IArticuloRepository;
import com.Teo.InventarioInicial.domain.api.IArticuloServicePort;
import com.Teo.InventarioInicial.domain.model.Articulo;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;


import java.util.List;

public class ArticuloUseCase implements IArticuloServicePort {

    private final IArticuloPersistencePort articuloPersistencePort;
    private final IArticuloRepository articuloRepository;
    private final ArticuloEntityMapper articuloEntityMapper;

    public ArticuloUseCase(IArticuloPersistencePort articuloPersistencePort, IArticuloRepository articuloRepository, ArticuloEntityMapper articuloEntityMapper) {
        this.articuloPersistencePort = articuloPersistencePort;
        this.articuloRepository = articuloRepository;
        this.articuloEntityMapper = articuloEntityMapper;
    }
    @Override
    public List<Articulo> getAllArticulo() {
        return articuloPersistencePort.getAllArticulo();
    }

    @Override
    public void saveArticulo(Articulo articulo) {


        articuloPersistencePort.save(articulo);
    }
    @Override
    public void deleteArticulo(Long id) {
        articuloPersistencePort.delete(id);
    }
    @Override
    public Articulo getArticulo(Long id) {
        return articuloPersistencePort.getArticulo(id);
    }



}
