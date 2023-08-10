package com.Teo.Inventario.adapters.http.handlers.impl;


import com.Teo.Inventario.adapters.http.dto.request.ConciliacionInventarioRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.ConciliacionInventarioResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IConciliacionInventarioHandler;

import java.util.List;

public class ConciliacionInventarioHandlerImpl implements IConciliacionInventarioHandler {


    @Override
    public void saveConciliacionInventario(ConciliacionInventarioRequestDto conciliacionInventarioRequestDto) {

    }

    @Override
    public void deleteConciliacionInventario(Long id) {

    }

    @Override
    public ConciliacionInventarioResponseDto getConciliacionInventario(Long id) {
        return null;
    }

    @Override
    public List<ConciliacionInventarioResponseDto> getAllConciliacionInventario() {
        return null;
    }
}
