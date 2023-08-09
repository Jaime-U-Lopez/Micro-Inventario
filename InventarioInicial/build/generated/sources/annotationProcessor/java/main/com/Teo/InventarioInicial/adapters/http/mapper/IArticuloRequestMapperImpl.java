package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T12:30:38-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class IArticuloRequestMapperImpl implements IArticuloRequestMapper {

    @Override
    public Articulo toArticulo(ArticuloRequestDto articuloRequestDto) {
        if ( articuloRequestDto == null ) {
            return null;
        }

        String nombreArticulo = null;
        String codigoArticulo = null;
        String ubicacion = null;

        nombreArticulo = articuloRequestDto.getNombreArticulo();
        codigoArticulo = articuloRequestDto.getCodigoArticulo();
        ubicacion = articuloRequestDto.getUbicacion();

        Almacen almacen = null;

        Articulo articulo = new Articulo( nombreArticulo, codigoArticulo, ubicacion, almacen );

        return articulo;
    }

    @Override
    public ArticuloEntity toArticuloEntity(Articulo articulo) {
        if ( articulo == null ) {
            return null;
        }

        ArticuloEntity articuloEntity = new ArticuloEntity();

        articuloEntity.setId( articulo.getId() );
        articuloEntity.setNombreArticulo( articulo.getNombreArticulo() );
        articuloEntity.setCodigoArticulo( articulo.getCodigoArticulo() );
        articuloEntity.setUbicacion( articulo.getUbicacion() );
        articuloEntity.setAlmacen( almacenToAlmacenEntity( articulo.getAlmacen() ) );

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
