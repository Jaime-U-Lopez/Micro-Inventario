package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T13:20:22-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class IAlmacenResponseMapperImpl implements IAlmacenResponseMapper {

    @Override
    public List<AlmacenResponseDto> toResponseList(List<Almacen> AlmacenList) {
        if ( AlmacenList == null ) {
            return null;
        }

        List<AlmacenResponseDto> list = new ArrayList<AlmacenResponseDto>( AlmacenList.size() );
        for ( Almacen almacen : AlmacenList ) {
            list.add( almacenToAlmacenDTO( almacen ) );
        }

        return list;
    }

    @Override
    public AlmacenResponseDto almacenToAlmacenDTO(Almacen almacen) {
        if ( almacen == null ) {
            return null;
        }

        Long id = null;
        String nombre = null;
        String direccion = null;

        id = almacen.getId();
        nombre = almacen.getNombre();
        direccion = almacen.getDireccion();

        AlmacenResponseDto almacenResponseDto = new AlmacenResponseDto( id, nombre, direccion );

        return almacenResponseDto;
    }

    @Override
    public AlmacenResponseDto toAlmacenDTO(AlmacenEntity AlmacenEntity) {
        if ( AlmacenEntity == null ) {
            return null;
        }

        Long id = null;
        String nombre = null;
        String direccion = null;

        id = AlmacenEntity.getId();
        nombre = AlmacenEntity.getNombre();
        direccion = AlmacenEntity.getDireccion();

        AlmacenResponseDto almacenResponseDto = new AlmacenResponseDto( id, nombre, direccion );

        return almacenResponseDto;
    }

    @Override
    public AlmacenEntity toAlmacenEntity(AlmacenResponseDto AlmacenResponseDto) {
        if ( AlmacenResponseDto == null ) {
            return null;
        }

        AlmacenEntity almacenEntity = new AlmacenEntity();

        almacenEntity.setId( AlmacenResponseDto.getId() );
        almacenEntity.setNombre( AlmacenResponseDto.getNombre() );
        almacenEntity.setDireccion( AlmacenResponseDto.getDireccion() );

        return almacenEntity;
    }

    @Override
    public Almacen toAlmacen(ArticuloEntity articuloEntity) {
        if ( articuloEntity == null ) {
            return null;
        }

        String nombre = null;
        String direccion = null;

        Almacen almacen = new Almacen( nombre, direccion );

        almacen.setId( articuloEntity.getId() );

        return almacen;
    }
}
