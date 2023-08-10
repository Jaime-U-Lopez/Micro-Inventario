package com.Teo.Inventario.domain.usecase;

import com.Teo.Inventario.domain.api.IInventarioInicialServicePort;
import com.Teo.Inventario.domain.model.InventarioInicial;
import com.Teo.Inventario.domain.spi.IConciliacionInventarioPersistencePort;

import java.util.List;

public class ConciliacionInventarioUseCase implements IInventarioInicialServicePort {


    private final IConciliacionInventarioPersistencePort conciliacionInventarioPersistencePort;

    public ConciliacionInventarioUseCase(IConciliacionInventarioPersistencePort conciliacionInventarioPersistencePort) {
        this.conciliacionInventarioPersistencePort = conciliacionInventarioPersistencePort;
    }

    @Override
    public void saveInventarioInicial(InventarioInicial inventarioInicial) {

    }

    @Override
    public void deleteInventarioInicial(Long id) {

    }

    @Override
    public InventarioInicial getInventarioInicial(Long id) {
        return null;
    }

    @Override
    public List<InventarioInicial> getAllInventarioInicial() {
        return null;
    }

    //private final IInventarioInicialPersistencePort inventarioInicialPersistencePort;
    //private final IRolRepository rolRepository;
    //private final RolEntityMapper rolEntityMapper;


}
