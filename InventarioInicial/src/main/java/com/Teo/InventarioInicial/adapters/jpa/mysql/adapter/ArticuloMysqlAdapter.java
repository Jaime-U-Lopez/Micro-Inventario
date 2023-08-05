package com.Teo.InventarioInicial.adapters.jpa.mysql.adapter;




import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.ArticuloEntityMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IArticuloRepository;
import com.Teo.InventarioInicial.domain.model.Articulo;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ArticuloMysqlAdapter implements IArticuloPersistencePort {


    private final IArticuloRepository articuloRepository;
    private final ArticuloEntityMapper articuloEntityMapper;


    @Override
    public void save(Articulo articulo) {
        articuloRepository.save(articuloEntityMapper.articulotoArticuloEntity(articulo));
    }

    @Override
    public void delete(Articulo articulo) {

            articuloRepository.deleteById(articulo.getId());
    }

    @Override
    public Articulo getArticulo(Long id) {
        return null;
    }

    @Override
    public List<Articulo> getAllArticulo() {
        return null;
    }






}
