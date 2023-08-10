package com.Teo.Inventario.adapters.jpa.mysql.mapper;

import com.Teo.Inventario.adapters.jpa.mysql.entity.ConciliacionInventarioEntity;
import com.Teo.Inventario.adapters.jpa.mysql.entity.ConteoInventarioEntity;
import com.Teo.Inventario.domain.model.ConciliacionInventario;
import com.Teo.Inventario.domain.model.ConteoInventario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface ConteoInventarioEntityMapper {
    //ConteoInventarioEntity toConteoInventarioEntity(ConteoInventario conteoInventario);
    ConteoInventario toConteoInventario(ConteoInventarioEntity conteoInventarioEntity);
}
