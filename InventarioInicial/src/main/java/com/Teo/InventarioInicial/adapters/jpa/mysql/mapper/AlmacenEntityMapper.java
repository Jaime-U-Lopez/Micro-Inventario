package com.Teo.InventarioInicial.adapters.jpa.mysql.mapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;

import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

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

    AlmacenEntity toAlmacenEntity(Almacen almacenAlmacen);

    List<Almacen> toAlmacenList(List<AlmacenEntity> almacenEntities);

}
