package com.Teo.Inventario.adapters.jpa.mysql.adapter;

import com.Teo.Inventario.adapters.jpa.mysql.mapper.InventarioInicialEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IInventarioInicialRepository;
import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.spi.IConteoInventarioPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class InventarioInicialMysqlAdapter implements IConteoInventarioPersistencePort {

    private final IInventarioInicialRepository inventarioInicialRepository;
    private final InventarioInicialEntityMapper inventarioInicialEntityMapper;


    @Override
    public void saveConteoInventario(ConteoInventario conteoInventario) {

    }

    @Override
    public void deleteConteoInventario(Long id) {

    }

    @Override
    public ConteoInventario getConteoInventario(Long id) {
        return null;
    }

    @Override
    public List<ConteoInventario> getAllConteoInventario() {
        return null;
    }
}
