package com.Teo.Inventario.adapters.http.handlers.impl;

import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.InventarioInicialResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IInventarioInicialHandler;

import java.util.List;

public class InventarioInicialHandlerImpl implements IInventarioInicialHandler {


    @Override
    public void saveInventarioInicial(InventarioInicialRequestDto inventarioInicialRequestDto) {

    }

    @Override
    public void deleteInventarioInicial(Long id) {

    }

    @Override
    public InventarioInicialResponseDto getInventarioInicial(Long id) {
        return null;
    }

    @Override
    public List<InventarioInicialResponseDto> getAllInventarioInicial() {
        return null;
    }
}
