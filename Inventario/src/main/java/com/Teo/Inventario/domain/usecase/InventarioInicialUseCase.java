package com.Teo.Inventario.domain.usecase;

import com.Teo.Inventario.domain.api.IInventarioInicialServicePort;
import com.Teo.Inventario.domain.model.InventarioInicial;
import com.Teo.Inventario.domain.spi.IConteoInventarioPersistencePort;
import com.Teo.Inventario.domain.spi.IInventarioInicialPersistencePort;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class InventarioInicialUseCase implements IInventarioInicialServicePort {

    //private final IInventarioInicialPersistencePort inventarioInicialPersistencePort;
    //private final IRolRepository rolRepository;
    //private final RolEntityMapper rolEntityMapper;


    private final IInventarioInicialPersistencePort inventarioInicialPersistencePort;

    public InventarioInicialUseCase(IInventarioInicialPersistencePort inventarioInicialPersistencePort) {
        this.inventarioInicialPersistencePort = inventarioInicialPersistencePort;
    }

    @Override
    public void saveInventarioInicial(InventarioInicial inventarioInicial) {
    this.inventarioInicialPersistencePort.saveInventarioInicial(inventarioInicial);
    }

    @Override
    public void deleteInventarioInicial(Long id) {
    this.inventarioInicialPersistencePort.deleteInventarioInicial(id);
    }

    @Override
    public InventarioInicial getInventarioInicial(Long id) {
        return this.inventarioInicialPersistencePort.getInventarioInicial(id);
    }

    @Override
    public List<InventarioInicial> getAllInventarioInicial() {
        return this.inventarioInicialPersistencePort.getAllInventarioInicial();
    }




}
