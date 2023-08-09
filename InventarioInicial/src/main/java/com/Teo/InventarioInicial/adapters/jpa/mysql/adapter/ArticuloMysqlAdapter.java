package com.Teo.InventarioInicial.adapters.jpa.mysql.adapter;




import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.exceptions.AlmacenException;
import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.ArticuloEntityMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IArticuloRepository;
import com.Teo.InventarioInicial.configuration.Constants;
import com.Teo.InventarioInicial.domain.model.Articulo;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ArticuloMysqlAdapter implements IArticuloPersistencePort {


    private final IArticuloRepository articuloRepository;
    private final ArticuloEntityMapper articuloEntityMapper;


    @Override
    public void save(Articulo articulo) {
        articuloRepository.save(articuloEntityMapper.articulotoArticuloEntity(articulo));
    }

    @Override
    public void delete(Long id) {

            getArticulo(id);

            articuloRepository.deleteById(id);
    }

    @Override
    public Articulo getArticulo(Long id) {

        Optional<ArticuloEntity> articuloEntityOptional= articuloRepository.findById(id);
        if(!articuloEntityOptional.isPresent()){
            new AlmacenException(Constants.NO_ES_MAYOR_DE_EDAD);
        }
        return articuloEntityMapper.articuloEntityToArticulo(articuloEntityOptional.get());

    }

    @Override
    public List<Articulo> getAllArticulo() {
        return  articuloEntityMapper.toArticuloList(articuloRepository.findAll());
    }






}
