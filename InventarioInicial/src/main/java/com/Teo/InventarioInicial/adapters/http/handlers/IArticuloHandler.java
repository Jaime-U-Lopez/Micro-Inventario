package com.Teo.InventarioInicial.adapters.http.handlers;

import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.ArticuloEntity;

import java.util.List;

public interface IArticuloHandler {

    void saveArticulo(ArticuloRequestDto articuloRequestDto);

    void deleteArticulo(ArticuloRequestDtoDelete articuloRequestDtoDelete);

    ArticuloResponseDto getArticulo(Long id);
    List<ArticuloResponseDto> getAllArticulo();

}
