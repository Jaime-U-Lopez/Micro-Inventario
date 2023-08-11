package com.Teo.Inventario.adapters.http.handlers.impl;

import com.Teo.Inventario.adapters.http.dto.request.GrupoDeConteoRequestDto;
import com.Teo.Inventario.adapters.http.handlers.IGrupoDeConteoHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GrupoDeConteoHandlerImpl implements IGrupoDeConteoHandler {

    @Override
    public void saveGrupoDeConteo(GrupoDeConteoRequestDto grupoDeConteoRequestDto) {

    }

    @Override
    public void deleteGrupoDeConteo(Long id) {

    }

    @Override
    public GrupoDeConteoRequestDto getGrupoDeConteo(Long id) {
        return null;
    }

    @Override
    public List<GrupoDeConteoRequestDto> getAllGrupoDeConteo() {
        return null;
    }
}
