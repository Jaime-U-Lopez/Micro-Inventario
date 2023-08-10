package com.Teo.Inventario.adapters.http.mapper;
import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.InventarioInicialResponseDto;
import com.Teo.Inventario.domain.model.InventarioInicial;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IInventarioInicialMapper {

    InventarioInicial toInventarioInicial(InventarioInicialRequestDto inventarioInicialRequestDto);
//    List<InventarioInicialResponseDto> toResponseList(List<InventarioInicial> inicialList);
}
