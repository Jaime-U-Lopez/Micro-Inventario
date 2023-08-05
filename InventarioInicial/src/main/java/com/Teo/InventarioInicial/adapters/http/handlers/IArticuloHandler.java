package com.Teo.InventarioInicial.adapters.http.handlers;

import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;

public interface IArticuloHandler {

    void saveArticulo(ArticuloRequestDto articuloRequestDto);

    void deleteArticulo(ArticuloRequestDto articuloRequestDto);

    ArticuloResponseDto getArticulo(Long id);


}
