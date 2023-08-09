package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;

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
    date = "2023-08-09T11:57:22-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class ArticuloEntityMapperImpl implements ArticuloEntityMapper {

    @Override
    public Articulo articuloEntityToArticulo(ArticuloEntity articuloEntity) {
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

    @Override
    public ArticuloEntity articulotoArticuloEntity(Articulo articulo) {
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
    public List<Articulo> toArticuloList(List<ArticuloEntity> articuloEntityList) {
        if ( articuloEntityList == null ) {
            return null;
        }

        List<Articulo> list = new ArrayList<Articulo>( articuloEntityList.size() );
        for ( ArticuloEntity articuloEntity : articuloEntityList ) {
            list.add( articuloEntityToArticulo( articuloEntity ) );
        }

        return list;
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
}