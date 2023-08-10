package com.Teo.Inventario.adapters.http.handlers;


public interface IConteoInventarioHandler {

    void saveUser(UsuarioRequestDto usuarioRequestDto);

    void deleteUsuario(UsuarioRequestDto usuarioRequestDto);

    UsuarioResponseDto getUsuario(Long id);




}
