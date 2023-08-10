package com.Teo.Inventario.adapters.jpa.mysql.mapper;

import com.Teo.Inventario.adapters.jpa.mysql.entity.ConciliacionInventarioEntity;
import com.Teo.Inventario.adapters.jpa.mysql.entity.GruposDeConteoEntity;
import com.Teo.Inventario.domain.model.ConciliacionInventario;
import com.Teo.Inventario.domain.model.GruposDeConteo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface GrupoDeConteoEntityMapper {
    GruposDeConteoEntity toGruposDeConteoEntity(GruposDeConteo grupoDeConteo);

    GruposDeConteo toGruposDeConteo(GruposDeConteoEntity grupoDeConteoEntity);

}
