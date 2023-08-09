package com.Teo.InventarioInicial.adapters.jpa.mysql.adapter;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.exceptions.AlmacenException;
import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.AlmacenEntityMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IAlmacenRepository;
import com.Teo.InventarioInicial.configuration.Constants;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.spi.IAlmacenPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class AlmacenMysqlAdapter implements IAlmacenPersistencePort {



    private final IAlmacenRepository almacenRepository;
    private final AlmacenEntityMapper almacenEntityMapper;


    @Override
    public void save(Almacen almacen) {
        almacenRepository.save(almacenEntityMapper.toAlmacenEntity(almacen));
    }

    @Override
    public void delete(Long id) {

        getAlmacen(id);
        almacenRepository.deleteById(id);

    }
    @Override
    public Almacen getAlmacen(Long id) {

        Optional<AlmacenEntity>  almacenEntityOptional= almacenRepository.findById(id);
        if(!almacenEntityOptional.isPresent()){
           throw  new AlmacenException(Constants.ALMACEN_NO_REGISTRADO);
        }
        return almacenEntityMapper.toAlmacen(almacenEntityOptional.get());
    }

    @Override
    public List<Almacen> getAllAlmacen() {
        return almacenEntityMapper.toAlmacenList(almacenRepository.findAll());
    }


}
