package com.Teo.Inventario.domain.usecase;

import com.Teo.Inventario.domain.api.IConteoInventarioServicePort;
import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.spi.IConteoInventarioPersistencePort;

import java.util.List;

public class ConteoInventarioUseCase implements IConteoInventarioServicePort {



    private final IConteoInventarioPersistencePort conteoInventarioPersistencePort;


    public ConteoInventarioUseCase(IConteoInventarioPersistencePort conteoInventarioPersistencePort) {
        this.conteoInventarioPersistencePort = conteoInventarioPersistencePort;
    }

    @Override
    public void saveConteoInventario(ConteoInventario conteoInventario) {
        this.conteoInventarioPersistencePort.saveConteoInventario(conteoInventario);
    }

    @Override
    public void deleteConteoInventario(Long id) {
this.conteoInventarioPersistencePort.deleteConteoInventario(id);
    }

    @Override
    public ConteoInventario getConteoInventario(Long id) {
        return this.conteoInventarioPersistencePort.getConteoInventario(id);
    }

    @Override
    public List<ConteoInventario> getAllConteoInventario() {
        return this.conteoInventarioPersistencePort.getAllConteoInventario();

    }

}
