package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAlmacenResponseMapper {



    IArticuloResponseMapper INSTANCE = Mappers.getMapper(IArticuloResponseMapper.class);
    List<AlmacenResponseDto> toResponseList(List<Almacen> AlmacenList);

    AlmacenResponseDto almacenToAlmacenDTO(Almacen almacen);

    AlmacenResponseDto toAlmacenDTO(AlmacenEntity AlmacenEntity);
    AlmacenEntity toAlmacenEntity(AlmacenResponseDto AlmacenResponseDto);
    Almacen toAlmacen(ArticuloEntity articuloEntity );

}
