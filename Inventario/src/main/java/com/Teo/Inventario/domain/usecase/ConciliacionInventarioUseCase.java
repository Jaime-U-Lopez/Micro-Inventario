package com.Teo.Inventario.domain.usecase;

import com.Teo.Inventario.domain.api.IConciliacionInventarioServicePort;
import com.Teo.Inventario.domain.api.IInventarioInicialServicePort;
import com.Teo.Inventario.domain.model.InventarioInicial;
import com.Teo.Inventario.domain.spi.IConciliacionInventarioPersistencePort;

import java.util.List;

public class ConciliacionInventarioUseCase implements IConciliacionInventarioServicePort {


    private final IConciliacionInventarioPersistencePort conciliacionInventarioPersistencePort;

    public ConciliacionInventarioUseCase(IConciliacionInventarioPersistencePort conciliacionInventarioPersistencePort) {
        this.conciliacionInventarioPersistencePort = conciliacionInventarioPersistencePort;
    }


    @Override
    public void saveConciliacionInventario(InventarioInicial inventarioInicial) {

    }

    @Override
    public void deleteConciliacionInventario(Long id) {

    }

    @Override
    public InventarioInicial getConciliacionInventario(Long id) {
        return null;
    }

    @Override
    public List<InventarioInicial> getAllConciliacionInventario() {
        return null;
    }
}
