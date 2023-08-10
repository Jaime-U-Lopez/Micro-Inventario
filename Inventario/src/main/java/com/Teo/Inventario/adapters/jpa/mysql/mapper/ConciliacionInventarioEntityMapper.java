package com.Teo.Inventario.adapters.jpa.mysql.mapper;

import com.Teo.Inventario.adapters.jpa.mysql.entity.ConciliacionInventarioEntity;
import com.Teo.Inventario.domain.model.ConciliacionInventario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface ConciliacionInventarioEntityMapper {
  //  ConciliacionInventarioEntity toConciliacionInventarioEntity(ConciliacionInventario conciliacionInventario);

    ConciliacionInventario toConciliacionInventario(ConciliacionInventarioEntity conciliacionInventarioEntity);

}
