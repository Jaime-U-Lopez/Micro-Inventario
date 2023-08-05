package com.Teo.InventarioInicial.adapters.http.mapper;



import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
import com.Teo.InventarioInicial.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IArticuloResponseMapper {


    List<ArticuloResponseDto> toResponseList(List<Articulo> articuloList);
    ArticuloResponseDto toArticuloDTO(Articulo articulo);
    Articulo toArticulo(ArticuloResponseDto articuloResponseDto);


}
