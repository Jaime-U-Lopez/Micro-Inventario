package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T14:33:47-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class IAlmacenRequestMapperImpl implements IAlmacenRequestMapper {

    @Override
    public Almacen toAlmacen(AlmacenRequestDto almacenRequestDto) {
        if ( almacenRequestDto == null ) {
            return null;
        }

        String nombre = null;
        String direccion = null;

        Almacen almacen = new Almacen( nombre, direccion );

        return almacen;
    }

    @Override
    public Almacen almacenEntityToAlmacen(AlmacenEntity almacenEntity) {
        if ( almacenEntity == null ) {
            return null;
        }

        String nombre = null;
        String direccion = null;

        nombre = almacenEntity.getNombre();
        direccion = almacenEntity.getDireccion();

        Almacen almacen = new Almacen( nombre, direccion );

        almacen.setId( almacenEntity.getId() );

        return almacen;
    }

    @Override
    public AlmacenEntity toAlmacenEntity(AlmacenRequestDto almacenRequestDto) {
        if ( almacenRequestDto == null ) {
            return null;
        }

        AlmacenEntity almacenEntity = new AlmacenEntity();

        return almacenEntity;
    }

    @Override
    public Almacen toAlmacenDelete(AlmacenRequestDtoDelete almacenRequestDtoDelete) {
        if ( almacenRequestDtoDelete == null ) {
            return null;
        }

        String nombre = null;
        String direccion = null;

        Almacen almacen = new Almacen( nombre, direccion );

        return almacen;
    }
}
