package com.Teo.Inventario.adapters.jpa.mysql.adapter;

import com.Teo.Inventario.adapters.jpa.mysql.mapper.ConteoInventarioEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IConteoInventarioRepository;
import com.Teo.Inventario.domain.model.ConteoInventario;
import com.Teo.Inventario.domain.spi.IConteoInventarioPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ConteoInventarioMysqlAdapter implements IConteoInventarioPersistencePort {


    private final IConteoInventarioRepository conteoInventarioRepository;
    private final ConteoInventarioEntityMapper conteoInventarioEntityMapper;


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
