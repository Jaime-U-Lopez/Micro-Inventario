package com.Teo.Inventario.adapters.http.handlers;

import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;

public interface IInventarioInicialHandler {

    void saveInventarioInicial(InventarioInicialRequestDto inventarioInicialRequestDto);

    void deleteUsuario(UsuarioRequestDto usuarioRequestDto);

    UsuarioResponseDto getUsuario(Long id);




}
