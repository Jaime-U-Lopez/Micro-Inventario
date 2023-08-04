package com.Teo.InventarioInicial.adapters.jpa.mysql.adapter;

import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
import com.Teo.InventarioInicial.domain.spi.IAlmacenPersistencePort;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class AlmacenMysqlAdapter implements IAlmacenPersistencePort {






    @Override
    public void save(Almacen almacen) {

    }

    @Override
    public void delete(Almacen almacen) {

    }

    @Override
    public Almacen getAlmacen(Almacen almacen) {
        return null;
    }

    @Override
    public List<Almacen> getAllAlmacen() {
        return null;
    }
    //private final IRolRepository rolRepository;
    //private final AlmacenEntityMapper rolEntityMapper;






}
