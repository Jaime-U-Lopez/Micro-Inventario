package com.Teo.Inventario.adapters.http.handlers;

import com.Teo.Inventario.adapters.http.dto.request.GrupoDeConteoRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.GrupoDeConteoResponseDto;

import java.util.List;

public interface IGrupoDeConteoHandler {

    void saveGrupoDeConteo(GrupoDeConteoRequestDto grupoDeConteoRequestDto);

    void deleteGrupoDeConteo(Long id);

    GrupoDeConteoResponseDto getGrupoDeConteo(Long id);


    List<GrupoDeConteoResponseDto> getAllGrupoDeConteo();


}
