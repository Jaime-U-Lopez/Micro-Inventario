package com.Teo.Inventario.adapters.jpa.mysql.adapter;

import com.Teo.Inventario.adapters.jpa.mysql.mapper.GrupoDeConteoEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IGruposDeConteoRepository;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.spi.IGrupoDeConteoPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class GruposDeControlMysqlAdapter implements IGrupoDeConteoPersistencePort {


    private final IGruposDeConteoRepository gruposDeConteoRepository;
    private final GrupoDeConteoEntityMapper  grupoDeConteoEntityMapper;


    @Override
    public void saveGrupoDeConteo(GruposDeConteo gruposDeConteo) {

    }

    @Override
    public void deleteGrupoDeConteo(GruposDeConteo gruposDeConteo) {

    }

    @Override
    public GruposDeConteo getGrupoDeConteo(Long id) {
        return null;
    }


    @Override
    public List<GruposDeConteo> getAllGruposDeConteo() {
        return null;
    }
}
