package com.Teo.InventarioInicial.configuration;

import com.Teo.InventarioInicial.adapters.jpa.mysql.adapter.AlmacenMysqlAdapter;
import com.Teo.InventarioInicial.adapters.jpa.mysql.adapter.ArticuloMysqlAdapter;
import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.AlmaEntMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.ArticEntMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IAlmacenRepository;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IArticuloRepository;
import com.Teo.InventarioInicial.domain.api.IAlmacenServicePort;
import com.Teo.InventarioInicial.domain.api.IArticuloServicePort;
import com.Teo.InventarioInicial.domain.spi.IAlmacenPersistencePort;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;
import com.Teo.InventarioInicial.domain.usecase.AlmacenUseCase;
import com.Teo.InventarioInicial.domain.usecase.ArticuloUseCase;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {


    private final IArticuloRepository  articuloRepository;
    private final ArticEntMapper articuloEntityMapper;
    private final AlmaEntMapper almacenEntityMapper;
    private final IAlmacenRepository almacenRepository;


    @Bean
    public IArticuloServicePort articuloServicePort(){
        return new ArticuloUseCase(articuloPersistencePort(),articuloRepository,articuloEntityMapper);
    }

    @Bean
    public IAlmacenServicePort  almacenServicePort(){
        return new AlmacenUseCase(almacenPersistencePort(),almacenEntityMapper,almacenRepository);
    }

    @Bean
    public IArticuloPersistencePort  articuloPersistencePort() {
        return new ArticuloMysqlAdapter(articuloRepository, articuloEntityMapper);
    }


    @Bean
    public IAlmacenPersistencePort almacenPersistencePort() {
        return new AlmacenMysqlAdapter(almacenRepository ,almacenEntityMapper);
    }

}
