package com.Teo.InventarioInicial.adapters.http.mapper;


import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.domain.model.Almacen;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAlmacenRequestMapper {

    Almacen toRol(AlmacenRequestDto almacenRequestDto);

}
