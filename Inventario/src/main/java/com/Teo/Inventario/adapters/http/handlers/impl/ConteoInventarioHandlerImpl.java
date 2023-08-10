package com.Teo.Inventario.adapters.http.handlers.impl;


import com.Teo.Inventario.adapters.http.dto.request.ConteoInventarioRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.ConteoInventarioResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IConteoInventarioHandler;

import java.util.List;

public class ConteoInventarioHandlerImpl implements IConteoInventarioHandler {

    @Override
    public void saveConteoInventario(ConteoInventarioRequestDto conteoInventarioRequestDto) {

    }

    @Override
    public void deleteConteoInventario(long id) {

    }

    @Override
    public ConteoInventarioResponseDto getConteoInventario(Long id) {
        return null;
    }

    @Override
    public List<ConteoInventarioResponseDto> getAllConteoInventario() {
        return null;
    }
}
