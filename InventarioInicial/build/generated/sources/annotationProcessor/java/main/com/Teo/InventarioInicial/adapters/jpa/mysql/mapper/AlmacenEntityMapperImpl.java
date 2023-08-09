package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-09T14:33:47-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class AlmacenEntityMapperImpl implements AlmacenEntityMapper {

    @Override
    public Almacen toAlmacen(AlmacenEntity almacenEntityEntity) {
        if ( almacenEntityEntity == null ) {
            return null;
        }

        String nombre = null;
        String direccion = null;

        nombre = almacenEntityEntity.getNombre();
        direccion = almacenEntityEntity.getDireccion();

        Almacen almacen = new Almacen( nombre, direccion );

        almacen.setId( almacenEntityEntity.getId() );

        return almacen;
    }

    @Override
    public AlmacenEntity toAlmacenEntity(Almacen almacenAlmacen) {
        if ( almacenAlmacen == null ) {
            return null;
        }

        AlmacenEntity almacenEntity = new AlmacenEntity();

        almacenEntity.setId( almacenAlmacen.getId() );
        almacenEntity.setNombre( almacenAlmacen.getNombre() );
        almacenEntity.setDireccion( almacenAlmacen.getDireccion() );

        return almacenEntity;
    }

    @Override
    public List<Almacen> toAlmacenList(List<AlmacenEntity> almacenEntities) {
        if ( almacenEntities == null ) {
            return null;
        }

        List<Almacen> list = new ArrayList<Almacen>( almacenEntities.size() );
        for ( AlmacenEntity almacenEntity : almacenEntities ) {
            list.add( toAlmacen( almacenEntity ) );
        }

        return list;
    }
}
