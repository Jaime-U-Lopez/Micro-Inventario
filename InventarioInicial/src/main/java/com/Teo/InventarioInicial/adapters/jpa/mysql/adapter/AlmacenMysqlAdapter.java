package com.Teo.InventarioInicial.adapters.jpa.mysql.adapter;

import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.AlmacenEntityMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IAlmacenRepository;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.spi.IAlmacenPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AlmacenMysqlAdapter implements IAlmacenPersistencePort {



    private final IAlmacenRepository AlmacenRepository;
    private final AlmacenEntityMapper almacenEntityMapper;


    @Override
    public void save(Almacen almacen) {

    }

    @Override
    public void delete(Almacen almacen) {

    }
    @Override
    public Almacen getAlmacen(Long id) {
        return null;
    }

    @Override
    public List<Almacen> getAllAlmacen() {
        return null;
    }


}
