package com.Teo.InventarioInicial.adapters.http.mapper;



import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.mapper.AlmacenEntityMapper;
import com.Teo.InventarioInicial.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IArticuloResponseMapper {

    IArticuloResponseMapper INSTANCE = Mappers.getMapper(IArticuloResponseMapper.class);
    List<ArticuloResponseDto> toResponseList(List<Articulo> articuloList);

    ArticuloResponseDto articuloToArticuloDTO(Articulo articulo);

    ArticuloResponseDto toArticuloDTO(ArticuloEntity articuloEntity);
    ArticuloEntity toArticuloEntity(ArticuloResponseDto articuloResponseDto);
    Articulo toArticulo(ArticuloEntity articuloEntity );

}
