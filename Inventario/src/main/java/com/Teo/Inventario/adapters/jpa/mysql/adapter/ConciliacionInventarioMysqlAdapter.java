package com.Teo.Inventario.adapters.jpa.mysql.adapter;

import com.Teo.Inventario.adapters.jpa.mysql.mapper.ConciliacionInventarioEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IConciliacionInventarioRepository;
import com.Teo.Inventario.domain.model.ConciliacionInventario;
import com.Teo.Inventario.domain.spi.IConciliacionInventarioPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ConciliacionInventarioMysqlAdapter implements IConciliacionInventarioPersistencePort {


    private final IConciliacionInventarioRepository conciliacionInventarioRepository;
    private final ConciliacionInventarioEntityMapper conciliacionInventarioEntityMapper;


    @Override
    public void saveConciliacionInventario(ConciliacionInventario conciliacionInventario) {

    }

    @Override
    public void deleteConciliacionInventario(Long id) {

    }

    @Override
    public ConciliacionInventario getConciliacionInventario(Long id) {
        return null;
    }


    @Override
    public List<ConciliacionInventario> getAllConciliacionInventario() {
        return null;
    }
}
