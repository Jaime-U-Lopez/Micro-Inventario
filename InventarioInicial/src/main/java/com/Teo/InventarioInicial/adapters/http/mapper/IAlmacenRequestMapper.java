package com.Teo.InventarioInicial.adapters.http.mapper;


import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAlmacenRequestMapper {

    Almacen toAlmacen(AlmacenRequestDto almacenRequestDto);
    Almacen almacenEntityToAlmacen(AlmacenEntity almacenEntity);
    AlmacenEntity toAlmacenEntity(AlmacenRequestDto almacenRequestDto);
    Almacen toAlmacenDelete(AlmacenRequestDtoDelete almacenRequestDtoDelete);

}
