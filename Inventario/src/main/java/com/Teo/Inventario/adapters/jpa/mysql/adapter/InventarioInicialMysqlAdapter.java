package com.Teo.Inventario.adapters.jpa.mysql.adapter;

import com.Teo.Inventario.adapters.jpa.mysql.entity.InventarioInicialEntity;
import com.Teo.Inventario.adapters.jpa.mysql.mapper.InventarioInicialEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IInventarioInicialRepository;
import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.model.InventarioInicial;
import com.Teo.Inventario.domain.spi.IConteoInventarioPersistencePort;
import com.Teo.Inventario.domain.spi.IInventarioInicialPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class InventarioInicialMysqlAdapter implements IInventarioInicialPersistencePort {

    private final IInventarioInicialRepository inventarioInicialRepository;
    private final InventarioInicialEntityMapper inventarioInicialEntityMapper;


    @Override
    public void saveInventarioInicial(InventarioInicial inventarioInicial) {


        inventarioInicialRepository.saveAndFlush( inventarioInicialEntityMapper.toInventarioInicialEntity(inventarioInicial));
    }

    @Override
    public void deleteInventarioInicial(Long id) {

        getInventarioInicial(id);
        inventarioInicialRepository.deleteById(id);
    }

    @Override
    public InventarioInicial getInventarioInicial(Long id) {

        Optional <InventarioInicialEntity> inventarioInicialEntity=  inventarioInicialRepository.findById(id);
        return inventarioInicialEntityMapper.toInventarioInicial(inventarioInicialEntity.get());
    }

    @Override
    public List<InventarioInicial> getAllInventarioInicial() {
        return  inventarioInicialEntityMapper.toInventarioInicialList(inventarioInicialRepository.findAll());
    }
}
