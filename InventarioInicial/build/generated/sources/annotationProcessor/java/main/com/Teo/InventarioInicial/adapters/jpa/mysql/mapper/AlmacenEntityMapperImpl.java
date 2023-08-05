package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-05T18:35:20-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class AlmacenEntityMapperImpl implements AlmacenEntityMapper {

    @Override
    public Almacen toAlmacen(AlmacenEntity almacenEntityEntity) {
        if ( almacenEntityEntity == null ) {
            return null;
        }

        Long id = null;
        String nombre = null;
        String direccion = null;

        Almacen almacen = new Almacen( id, nombre, direccion );

        return almacen;
    }
}
