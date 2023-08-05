package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
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
public class IArticuloResponseMapperImpl implements IArticuloResponseMapper {

    @Override
    public List<ArticuloResponseDto> toResponseList(List<Articulo> articuloList) {
        if ( articuloList == null ) {
            return null;
        }

        List<ArticuloResponseDto> list = new ArrayList<ArticuloResponseDto>( articuloList.size() );
        for ( Articulo articulo : articuloList ) {
            list.add( toArticuloDTO( articulo ) );
        }

        return list;
    }

    @Override
    public ArticuloResponseDto toArticuloDTO(Articulo articulo) {
        if ( articulo == null ) {
            return null;
        }

        ArticuloResponseDto articuloResponseDto = new ArticuloResponseDto();

        return articuloResponseDto;
    }

    @Override
    public Articulo toArticulo(ArticuloResponseDto articuloResponseDto) {
        if ( articuloResponseDto == null ) {
            return null;
        }

        Articulo articulo = new Articulo();

        return articulo;
    }
}
