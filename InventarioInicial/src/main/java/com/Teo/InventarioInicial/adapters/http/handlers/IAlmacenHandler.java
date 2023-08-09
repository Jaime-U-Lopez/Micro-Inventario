package com.Teo.InventarioInicial.adapters.http.handlers;


import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;

import java.util.List;

public interface IAlmacenHandler {
    List<AlmacenResponseDto> getAllAlmacenes();
    void saveAlmacen(AlmacenRequestDto almacenRequestDto);
    void deleteAlmacen(AlmacenRequestDtoDelete almacenRequestDtoDelete);

    AlmacenResponseDto getAlmacen(Long id);

}
