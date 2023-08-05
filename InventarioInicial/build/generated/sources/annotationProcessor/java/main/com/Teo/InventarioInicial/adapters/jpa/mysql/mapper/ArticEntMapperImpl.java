package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.domain.model.Articulo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-05T17:18:01-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class ArticEntMapperImpl implements ArticEntMapper {

    @Override
    public Articulo rolEntityToRol(ArticuloEntity articuloEntity) {
        if ( articuloEntity == null ) {
            return null;
        }

        Articulo articulo = new Articulo();

        return articulo;
    }

    @Override
    public ArticuloEntity roltoRolEntity(Articulo articulo) {
        if ( articulo == null ) {
            return null;
        }

        ArticuloEntity articuloEntity = new ArticuloEntity();

        return articuloEntity;
    }

    @Override
    public List<Articulo> toRolList(List<ArticuloEntity> articuloEntityList) {
        if ( articuloEntityList == null ) {
            return null;
        }

        List<Articulo> list = new ArrayList<Articulo>( articuloEntityList.size() );
        for ( ArticuloEntity articuloEntity : articuloEntityList ) {
            list.add( rolEntityToRol( articuloEntity ) );
        }

        return list;
    }
}
