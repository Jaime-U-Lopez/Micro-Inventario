package com.Teo.Inventario.domain.usecase;

import com.Teo.Inventario.domain.api.IConciliacionInventarioServicePort;
import com.Teo.Inventario.domain.api.IInventarioInicialServicePort;
import com.Teo.Inventario.domain.model.ConciliacionInventario;
import com.Teo.Inventario.domain.model.InventarioInicial;
import com.Teo.Inventario.domain.spi.IConciliacionInventarioPersistencePort;

import java.util.List;

public class ConciliacionInventarioUseCase implements IConciliacionInventarioServicePort {


    private final IConciliacionInventarioPersistencePort conciliacionInventarioPersistencePort;

    public ConciliacionInventarioUseCase(IConciliacionInventarioPersistencePort conciliacionInventarioPersistencePort) {
        this.conciliacionInventarioPersistencePort = conciliacionInventarioPersistencePort;
    }

    @Override
    public void saveConciliacionInventario(ConciliacionInventario conciliacionInventario) {
       this.saveConciliacionInventario(conciliacionInventario);
    }

    @Override
    public void deleteConciliacionInventario(Long id) {
       this.conciliacionInventarioPersistencePort.deleteConciliacionInventario(id);
    }

    @Override
    public ConciliacionInventario getConciliacionInventario(Long id) {
        return this.conciliacionInventarioPersistencePort.getConciliacionInventario(id);
    }

    @Override
    public List<ConciliacionInventario> getAllConciliacionInventario() {
        return this.conciliacionInventarioPersistencePort.getAllConciliacionInventario();
    }
}
