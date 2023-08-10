package com.Teo.Inventario.adapters.http.handlers;


import com.Teo.Inventario.adapters.http.dto.request.ConciliacionInventarioRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.ConciliacionInventarioResponseDto;
import com.Teo.Inventario.adapters.http.dto.response.ConteoInventarioResponseDto;

import java.util.List;

public interface IConciliacionInventarioHandler {

    void saveConciliacionInventario(ConciliacionInventarioRequestDto conciliacionInventarioRequestDto);

    void deleteConciliacionInventario(Long id);

    ConciliacionInventarioResponseDto getConciliacionInventario(Long id);

    List<ConciliacionInventarioResponseDto> getAllConciliacionInventario();


}
