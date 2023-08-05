package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;

import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.domain.model.Almacen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface AlmacenEntityMapper {
    AlmacenEntityMapper INSTANCE = Mappers.getMapper(AlmacenEntityMapper.class);
/*
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "direccion", target = "direccion")

*/
    Almacen toAlmacen(AlmacenEntity almacenEntityEntity);
    //AlmacenEntity toAlmacenEntity(Almacen almacen);
}
