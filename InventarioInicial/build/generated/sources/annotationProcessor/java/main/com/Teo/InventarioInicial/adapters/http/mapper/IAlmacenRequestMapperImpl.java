package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.domain.model.Almacen;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-05T17:18:01-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class IAlmacenRequestMapperImpl implements IAlmacenRequestMapper {

    @Override
    public Almacen toRol(AlmacenRequestDto almacenRequestDto) {
        if ( almacenRequestDto == null ) {
            return null;
        }

        Almacen almacen = new Almacen();

        return almacen;
    }
}
