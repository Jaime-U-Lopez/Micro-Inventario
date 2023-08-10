package com.Teo.Inventario.adapters.http.handlers;

import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.InventarioIniciaResponseDto;

import java.util.List;

public interface IInventarioInicialHandler {

    void saveInventarioInicial(InventarioInicialRequestDto inventarioInicialRequestDto);

    void deleteInventarioInicial(Long id );

    InventarioIniciaResponseDto getInventarioInicial(Long id);


    List<InventarioIniciaResponseDto> getAllInventarioInicial();



}
