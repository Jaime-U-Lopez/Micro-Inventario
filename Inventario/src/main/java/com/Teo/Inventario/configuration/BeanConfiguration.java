package com.Teo.Inventario.configuration;

import com.pragma.usuariomicroservice.adapters.jpa.mysql.adapter.RolMysqlAdapter;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.adapter.UsuarioMysqlAdapter;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.mapper.RolEntityMapper;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.mapper.UsuarioEntityMapper;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.repository.IRolRepository;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.repository.IUsuarioRepository;
import com.pragma.usuariomicroservice.domain.api.IRolServicePort;
import com.pragma.usuariomicroservice.domain.api.IUsuarioServicePort;
import com.pragma.usuariomicroservice.domain.spi.IRolPersistencePort;
import com.pragma.usuariomicroservice.domain.spi.IUsuarioPersistencePort;
import com.pragma.usuariomicroservice.domain.usecase.RolUseCase;
import com.pragma.usuariomicroservice.domain.usecase.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IUsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;
    private final IRolRepository rolRepository;
    private final RolEntityMapper rolEntityMapper;



    @Bean
    public IUsuarioServicePort usuarioServicePort(){
        return new UsuarioUseCase(usuarioPersistencePort(),rolRepository,rolEntityMapper);
    }

    @Bean
    public IRolServicePort rolServicePort(){
        return new RolUseCase(rolPersistencePort());
    }


    @Bean
    public IUsuarioPersistencePort usuarioPersistencePort() {
        return new UsuarioMysqlAdapter(usuarioRepository,usuarioEntityMapper);
    }

    @Bean
    public IRolPersistencePort rolPersistencePort() {
        return new RolMysqlAdapter(rolRepository,rolEntityMapper);
    }

}
