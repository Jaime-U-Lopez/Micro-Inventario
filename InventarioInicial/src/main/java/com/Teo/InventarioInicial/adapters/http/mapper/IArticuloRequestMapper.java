package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedTargetPolicy = ReportingPolicy.IGNORE,
unmappedSourcePolicy =  ReportingPolicy.IGNORE)
public interface IArticuloRequestMapper {

    Articulo toUsuario(ArticuloRequestDto articuloRequestDto);
}
