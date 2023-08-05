package com.Teo.InventarioInicial.adapters.http.handlers.impl;

import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.http.handlers.IAlmacenHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IArticuloHandlerImpl implements IAlmacenHandler {
    @Override
    public List<AlmacenResponseDto> getAllRoles() {
        return null;
    }

    @Override
    public void saveAlmacen(AlmacenRequestDto almacenRequestDto) {

    }

    @Override
    public void deleteAlmacen(AlmacenResponseDto almacenResponseDto) {

    }

    @Override
    public AlmacenResponseDto getAlmacen(Long id) {
        return null;
    }

    //private final IUsuarioServicePort usuarioServicePort;
    //private final IUsuarioRequestMapper usuarioRequestMapper;
    // private final IUsuarioResponseMapper usuarioResponseMapper;






}
