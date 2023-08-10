package com.Teo.Inventario.adapters.http.handlers;


import com.Teo.Inventario.adapters.http.dto.request.ConteoInventarioRequestDto;
import com.Teo.Inventario.adapters.http.dto.request.GrupoDeConteoRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.ConteoInventarioResponseDto;

import java.util.List;

public interface IConteoInventarioHandler {

    void saveConteoInventario(ConteoInventarioRequestDto conteoInventarioRequestDto);

    void deleteConteoInventario(long id );

    ConteoInventarioResponseDto getConteoInventario(Long id);


    List<ConteoInventarioResponseDto> getAllConteoInventario();

}
