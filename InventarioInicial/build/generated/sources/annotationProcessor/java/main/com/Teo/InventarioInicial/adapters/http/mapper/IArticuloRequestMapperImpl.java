package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-05T18:35:20-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class IArticuloRequestMapperImpl implements IArticuloRequestMapper {

    @Override
    public Articulo toUsuario(ArticuloRequestDto articuloRequestDto) {
        if ( articuloRequestDto == null ) {
            return null;
        }

        Long id = null;
        String nombreArticulo = null;
        String codigoArticulo = null;
        String ubicacion = null;
        Almacen almacen = null;

        Articulo articulo = new Articulo( id, nombreArticulo, codigoArticulo, ubicacion, almacen );

        return articulo;
    }
}
