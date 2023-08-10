package com.Teo.Inventario.adapters.http.handlers;

import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.InventarioInicialResponseDto;

import java.util.List;

public interface IInventarioInicialHandler {

    void saveInventarioInicial(InventarioInicialRequestDto inventarioInicialRequestDto);

    void deleteInventarioInicial(Long id );

    InventarioInicialResponseDto getInventarioInicial(Long id);


    List<InventarioInicialResponseDto> getAllInventarioInicial();



}
