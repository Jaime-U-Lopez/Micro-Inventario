package com.Teo.InventarioInicial.domain.usecase;

import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.AlmacenEntityMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IAlmacenRepository;
import com.Teo.InventarioInicial.domain.api.IAlmacenServicePort;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.spi.IAlmacenPersistencePort;

import java.util.List;

public class AlmacenUseCase implements IAlmacenServicePort {
    private final IAlmacenPersistencePort  almacenPersistencePort;
    private final AlmacenEntityMapper almacenEntityMapper;
    private final IAlmacenRepository iAlmacenRepository;

    public AlmacenUseCase(IAlmacenPersistencePort almacenPersistencePort, AlmacenEntityMapper almacenEntityMapper, IAlmacenRepository iAlmacenRepository) {
        this.almacenPersistencePort = almacenPersistencePort;
        this.almacenEntityMapper = almacenEntityMapper;
        this.iAlmacenRepository = iAlmacenRepository;
    }
    @Override
    public void saveAlmacen(Almacen almacen) {
        almacenPersistencePort.save(almacen);
    }
    @Override
    public void deleteALmacen(Long id) {

        almacenPersistencePort.delete(id);
    }
    @Override
    public Almacen getAlmacen(Long id) {
        return  almacenPersistencePort.getAlmacen(id);
    }
    @Override
    public List<Almacen> getAllAlmacen() {
        return almacenPersistencePort.getAllAlmacen();
    }

}
