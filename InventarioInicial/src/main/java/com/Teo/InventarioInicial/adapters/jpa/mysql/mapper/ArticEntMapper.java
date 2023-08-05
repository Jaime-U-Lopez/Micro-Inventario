package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;
import com.Teo.InventarioInicial.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ArticEntMapper {
   Articulo rolEntityToRol(ArticuloEntity articuloEntity);
   ArticuloEntity roltoRolEntity(Articulo articulo);
    List<Articulo> toRolList(List<ArticuloEntity> articuloEntityList);
}
