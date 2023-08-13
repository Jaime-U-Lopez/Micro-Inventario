package com.Teo.Inventario.adapters.http.mapper;
import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.GrupoDeConteoResponseDto;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import com.Teo.Inventario.domain.model.InventarioInicial;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IGruposDeConteoMapper {

    GrupoDeConteoResponseDto toGrupoDeConteoResponseDto(GruposDeConteo gruposDeConteo);
    List<GrupoDeConteoResponseDto> toResponseList(List<GruposDeConteo> gruposDeConteoList);



}
