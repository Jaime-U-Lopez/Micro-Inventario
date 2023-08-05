package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.domain.model.Almacen;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAlmacenResponseMapper {

 //   AlmacenResponseDto AlmacenToAlmacenResponse(Almacen almacen);

}
