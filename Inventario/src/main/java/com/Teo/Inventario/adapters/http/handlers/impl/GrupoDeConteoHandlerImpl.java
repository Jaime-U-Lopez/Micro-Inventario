package com.Teo.Inventario.adapters.http.handlers.impl;

import com.Teo.Inventario.adapters.http.dto.request.GrupoDeConteoRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.GrupoDeConteoResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IGrupoDeConteoHandler;
import com.Teo.Inventario.domain.api.IGrupoDeConteoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GrupoDeConteoHandlerImpl implements IGrupoDeConteoHandler {


    private final IGrupoDeConteoServicePort grupoDeConteoServicePort;




    @Override
    public void saveGrupoDeConteo(GrupoDeConteoRequestDto grupoDeConteoRequestDto) {

    }

    @Override
    public void deleteGrupoDeConteo(Long id) {

        this.grupoDeConteoServicePort.deleteGrupoDeConteo(id);

    }

    @Override
    public GrupoDeConteoResponseDto getGrupoDeConteo(Long id) {

        this.grupoDeConteoServicePort.getGruposDeConteo(id);

        return null ;
    }

    @Override
    public List<GrupoDeConteoResponseDto> getAllGrupoDeConteo() {
        return null;
    }
}
