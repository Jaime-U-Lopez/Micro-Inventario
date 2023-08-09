package com.Teo.InventarioInicial.adapters.http.mapper;

import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.domain.model.Articulo;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",
unmappedTargetPolicy = ReportingPolicy.IGNORE,
unmappedSourcePolicy =  ReportingPolicy.IGNORE)
public interface IArticuloRequestMapper {



    //@Mapping(source = "nombreArticulo", target = "nombreArticulo")
    //@Mapping(source = "codigoArticulo", target = "codigoArticulo")
    //@Mapping(source = "ubicacion", target = "ubicacion")
    Articulo toArticulo(ArticuloRequestDto articuloRequestDto);
    ArticuloEntity toArticuloEntity(Articulo articulo);
    Articulo toArticulo(ArticuloEntity articuloEntity);


}