package com.Teo.InventarioInicial.domain.usecase;

import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.AlmaEntMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IAlmacenRepository;
import com.Teo.InventarioInicial.domain.api.IAlmacenServicePort;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.spi.IAlmacenPersistencePort;

public class AlmacenUseCase implements IAlmacenServicePort {
    private final IAlmacenPersistencePort  almacenPersistencePort;
    private final AlmaEntMapper almacenEntityMapper;
    private final IAlmacenRepository iAlmacenRepository;

    public AlmacenUseCase(IAlmacenPersistencePort almacenPersistencePort, AlmaEntMapper almacenEntityMapper, IAlmacenRepository iAlmacenRepository) {
        this.almacenPersistencePort = almacenPersistencePort;
        this.almacenEntityMapper = almacenEntityMapper;
        this.iAlmacenRepository = iAlmacenRepository;
    }

    @Override
    public void saveAlmacen(Almacen almacen) {

    }

    @Override
    public void deleteALmacen(Almacen almacen) {

    }

    @Override
    public Almacen getAlmacen(Long id) {
        return null;
    }


}
