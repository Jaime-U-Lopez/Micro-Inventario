package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-05T17:18:01-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class AlmaEntMapperImpl implements AlmaEntMapper {

    @Override
    public AlmacenEntity toAlmacenEntity(Almacen almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenEntity almacenEntity = new AlmacenEntity();

        return almacenEntity;
    }
}
