package com.Teo.UsuariosInventario.configuration;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {


    /*

    private final IArticuloRepository  articuloRepository;
    private final ArticuloEntityMapper articuloEntityMapper;
    private final IArticuloPersistencePort articuloPersistencePort;
    private final IAlmacenRepository almacenRepository;
    private final IAlmacenPersistencePort almacenPersistencePort;
    private final AlmacenEntityMapper almacenEntityMapper;



    @Bean
    public IArticuloServicePort articuloServicePort(){
        return new ArticuloUseCase(articuloPersistencePort,articuloEntityMapper);
    }


    @Bean
    public IAlmacenServicePort  almacenServicePort(){
        return new AlmacenUseCase(almacenPersistencePort);
    }



    @Bean
    public IArticuloPersistencePort  articuloPersistencePort() {
        return new ArticuloMysqlAdapter(articuloRepository, articuloEntityMapper);
    }

    @Bean
    public IAlmacenPersistencePort iAlmacenPersistencePort() {
        return new AlmacenMysqlAdapter(almacenRepository ,almacenEntityMapper);
    }

 */

}
