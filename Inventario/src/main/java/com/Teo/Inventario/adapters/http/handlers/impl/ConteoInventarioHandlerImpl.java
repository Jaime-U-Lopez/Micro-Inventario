package com.Teo.Inventario.adapters.http.handlers.impl;


import com.Teo.Inventario.adapters.http.dto.request.ConteoInventarioRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.ConteoInventarioResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IConteoInventarioHandler;
import com.Teo.Inventario.adapters.jpa.mysql.repository.IConteoInventarioRepository;
import com.Teo.Inventario.domain.api.IConteoInventarioServicePort;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ConteoInventarioHandlerImpl implements IConteoInventarioHandler {

    private final IConteoInventarioServicePort conteoInventarioServicePort;
    private final IConteoInventarioRepository conteoInventarioRepository;


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
