package com.Teo.Inventario.configuration;

import com.Teo.Inventario.adapters.http.handlers.IConteoInventarioHandler;
import com.Teo.Inventario.adapters.jpa.mysql.adapter.ConciliacionInventarioMysqlAdapter;
import com.Teo.Inventario.adapters.jpa.mysql.adapter.ConteoInventarioMysqlAdapter;
import com.Teo.Inventario.adapters.jpa.mysql.adapter.GruposDeControlMysqlAdapter;
import com.Teo.Inventario.adapters.jpa.mysql.adapter.InventarioInicialMysqlAdapter;
import com.Teo.Inventario.adapters.jpa.mysql.mapper.ConciliacionInventarioEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.mapper.ConteoInventarioEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.mapper.GrupoDeConteoEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.mapper.InventarioInicialEntityMapper;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IConciliacionInventarioRepository;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IConteoInventarioRepository;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IGruposDeConteoRepository;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IInventarioInicialRepository;
import com.Teo.Inventario.domain.api.IConciliacionInventarioServicePort;
import com.Teo.Inventario.domain.api.IConteoInventarioServicePort;
import com.Teo.Inventario.domain.api.IGrupoDeConteoServicePort;
import com.Teo.Inventario.domain.api.IInventarioInicialServicePort;
import com.Teo.Inventario.domain.spi.IConciliacionInventarioPersistencePort;
import com.Teo.Inventario.domain.spi.IConteoInventarioPersistencePort;
import com.Teo.Inventario.domain.spi.IGrupoDeConteoPersistencePort;
import com.Teo.Inventario.domain.spi.IInventarioInicialPersistencePort;
import com.Teo.Inventario.domain.usecase.ConciliacionInventarioUseCase;
import com.Teo.Inventario.domain.usecase.ConteoInventarioUseCase;
import com.Teo.Inventario.domain.usecase.GruposDeConteoUseCase;
import com.Teo.Inventario.domain.usecase.InventarioInicialUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {


    private final IConteoInventarioRepository conteoInventarioRepository;
    private final ConteoInventarioEntityMapper conteoInventarioEntityMapper;
    private final IGruposDeConteoRepository gruposDeConteoRepository;
    private final GrupoDeConteoEntityMapper grupoDeConteoEntityMapper;
    private final IInventarioInicialRepository inventarioInicialRepository;
    private final InventarioInicialEntityMapper inventarioInicialEntityMapper;
    private final IConciliacionInventarioRepository conciliacionInventarioRepository;
    private final ConciliacionInventarioEntityMapper conciliacionInventarioEntityMapper;





    @Bean
    public IConciliacionInventarioServicePort usuarioServicePort(){
        return new ConciliacionInventarioUseCase(conciliacionInventarioPersistencePort());
    }

    @Bean
    public IInventarioInicialServicePort inventarioInicialServicePort(){
        return new InventarioInicialUseCase(inventarioInicialPersistencePort());
    }



    @Bean
    public IGrupoDeConteoServicePort grupoDeConteoServicePort(){
        return new GruposDeConteoUseCase(gruposDeConteoPersistencePort());
    }


    @Bean
    public IConteoInventarioServicePort conteoInventarioServicePort(){
        return new ConteoInventarioUseCase(conteoInventarioPersistencePort());
    }



    @Bean
    public IConciliacionInventarioPersistencePort   conciliacionInventarioPersistencePort() {
        return new ConciliacionInventarioMysqlAdapter(conciliacionInventarioRepository,conciliacionInventarioEntityMapper);
    }



    @Bean
    public IInventarioInicialPersistencePort inventarioInicialPersistencePort() {
        return new InventarioInicialMysqlAdapter(inventarioInicialRepository,inventarioInicialEntityMapper);
    }


    @Bean
    public IGrupoDeConteoPersistencePort   gruposDeConteoPersistencePort() {
        return new GruposDeControlMysqlAdapter(gruposDeConteoRepository,grupoDeConteoEntityMapper);
    }

    @Bean
    public IConteoInventarioPersistencePort conteoInventarioPersistencePort() {
        return new ConteoInventarioMysqlAdapter(conteoInventarioRepository,conteoInventarioEntityMapper);
    }

}
