package com.Teo.Inventario.adapters.jpa.mysql.mapper;

import com.Teo.Inventario.adapters.jpa.mysql.entity.ConciliacionInventarioEntity;
import com.Teo.Inventario.adapters.jpa.mysql.entity.InventarioInicialEntity;
import com.Teo.Inventario.domain.model.ConciliacionInventario;
import com.Teo.Inventario.domain.model.InventarioInicial;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface InventarioInicialEntityMapper {
    InventarioInicialEntity toInventarioInicialEntity(InventarioInicial inventarioInicial);
    InventarioInicial toInventarioInicial(InventarioInicialEntity InventarioInicialEntity);

}
