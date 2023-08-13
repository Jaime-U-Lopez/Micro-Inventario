package com.Teo.Inventario.adapters.jpa.mysql.adapter;

import com.Teo.Inventario.adapters.jpa.mysql.entity.GruposDeConteoEntity;
import com.Teo.Inventario.adapters.jpa.mysql.exceptions.GruposDeConteoException;
import com.Teo.Inventario.adapters.jpa.mysql.mapper.GrupoDeConteoEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IGruposDeConteoRepository;
import com.Teo.Inventario.configuration.Constants;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.spi.IGrupoDeConteoPersistencePort;
import jakarta.validation.GroupDefinitionException;
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
     gruposDeConteoRepository.saveAndFlush(grupoDeConteoEntityMapper.toGruposDeConteoEntity(gruposDeConteo));
    }

    @Override
    public void deleteGrupoDeConteo(Long id) {

        getGrupoDeConteo(id);
        this.gruposDeConteoRepository.deleteById(id);
    }

    @Override
    public GruposDeConteo getGrupoDeConteo(Long id) {
        Optional<GruposDeConteoEntity> gruposDeConteoEntity= this.gruposDeConteoRepository.findById(id);

        if(!gruposDeConteoEntity.isPresent()){
            throw new GruposDeConteoException(Constants.ENTITY_NO_EXISTE_BASE_DE_DATOS);
        }
        return grupoDeConteoEntityMapper.toGruposDeConteo(gruposDeConteoEntity.get());
    }

    @Override
    public List<GruposDeConteo> getAllGruposDeConteo() {

        return grupoDeConteoEntityMapper.toGruposDeConteoList(gruposDeConteoRepository.findAll());

    }
}
