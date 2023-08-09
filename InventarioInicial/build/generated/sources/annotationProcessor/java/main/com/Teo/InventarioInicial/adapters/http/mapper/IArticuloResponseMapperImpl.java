package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
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
public class IArticuloResponseMapperImpl implements IArticuloResponseMapper {

    @Override
    public List<ArticuloResponseDto> toResponseList(List<Articulo> articuloList) {
        if ( articuloList == null ) {
            return null;
        }

        List<ArticuloResponseDto> list = new ArrayList<ArticuloResponseDto>( articuloList.size() );
        for ( Articulo articulo : articuloList ) {
            list.add( articuloToArticuloDTO( articulo ) );
        }

        return list;
    }

    @Override
    public ArticuloResponseDto articuloToArticuloDTO(Articulo articulo) {
        if ( articulo == null ) {
            return null;
        }

        Long id = null;
        String nombreArticulo = null;
        String codigoArticulo = null;
        String ubicacion = null;
        AlmacenEntity almacen = null;

        id = articulo.getId();
        nombreArticulo = articulo.getNombreArticulo();
        codigoArticulo = articulo.getCodigoArticulo();
        ubicacion = articulo.getUbicacion();
        almacen = almacenToAlmacenEntity( articulo.getAlmacen() );

        ArticuloResponseDto articuloResponseDto = new ArticuloResponseDto( id, nombreArticulo, codigoArticulo, ubicacion, almacen );

        return articuloResponseDto;
    }

    @Override
    public ArticuloResponseDto toArticuloDTO(ArticuloEntity articuloEntity) {
        if ( articuloEntity == null ) {
            return null;
        }

        Long id = null;
        String nombreArticulo = null;
        String codigoArticulo = null;
        String ubicacion = null;
        AlmacenEntity almacen = null;

        id = articuloEntity.getId();
        nombreArticulo = articuloEntity.getNombreArticulo();
        codigoArticulo = articuloEntity.getCodigoArticulo();
        ubicacion = articuloEntity.getUbicacion();
        almacen = articuloEntity.getAlmacen();

        ArticuloResponseDto articuloResponseDto = new ArticuloResponseDto( id, nombreArticulo, codigoArticulo, ubicacion, almacen );

        return articuloResponseDto;
    }

    @Override
    public ArticuloEntity toArticuloEntity(ArticuloResponseDto articuloResponseDto) {
        if ( articuloResponseDto == null ) {
            return null;
        }

        ArticuloEntity articuloEntity = new ArticuloEntity();

        return articuloEntity;
    }

    @Override
    public Articulo toArticulo(ArticuloEntity articuloEntity) {
        if ( articuloEntity == null ) {
            return null;
        }

        String nombreArticulo = null;
        String codigoArticulo = null;
        String ubicacion = null;
        Almacen almacen = null;

        nombreArticulo = articuloEntity.getNombreArticulo();
        codigoArticulo = articuloEntity.getCodigoArticulo();
        ubicacion = articuloEntity.getUbicacion();
        almacen = almacenEntityToAlmacen( articuloEntity.getAlmacen() );

        Articulo articulo = new Articulo( nombreArticulo, codigoArticulo, ubicacion, almacen );

        articulo.setId( articuloEntity.getId() );

        return articulo;
    }

    protected AlmacenEntity almacenToAlmacenEntity(Almacen almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenEntity almacenEntity = new AlmacenEntity();

        almacenEntity.setId( almacen.getId() );
        almacenEntity.setNombre( almacen.getNombre() );
        almacenEntity.setDireccion( almacen.getDireccion() );

        return almacenEntity;
    }

    protected Almacen almacenEntityToAlmacen(AlmacenEntity almacenEntity) {
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
}
