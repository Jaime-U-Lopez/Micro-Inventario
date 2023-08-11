package com.Teo.Inventario.adapters.http.handlers.impl;

import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.InventarioInicialResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IInventarioInicialHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
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
