package com.Teo.InventarioInicial.domain.usecase;

import com.Teo.InventarioInicial.domain.api.IAlmacenServicePort;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.spi.IAlmacenPersistencePort;

import java.util.List;

public class AlmacenUseCase implements IAlmacenServicePort {

    private final IAlmacenPersistencePort  almacenPersistencePort;


    public AlmacenUseCase(IAlmacenPersistencePort almacenPersistencePort) {
        this.almacenPersistencePort = almacenPersistencePort;
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

    @Override
    public Almacen findUsuarioEntityByCorreo(String email) {
        return null;
    }
}
