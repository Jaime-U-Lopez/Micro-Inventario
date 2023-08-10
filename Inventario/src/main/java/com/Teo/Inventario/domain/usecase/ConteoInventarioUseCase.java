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

    }

    @Override
    public void deleteConteoInventario(ConteoInventario conteoInventario) {

    }

    @Override
    public ConteoInventario getConteoInventario(Long id) {
        return null;
    }

    @Override
    public List<GruposDeConteo> getAllConteoInventario() {
        return null;
    }
}
