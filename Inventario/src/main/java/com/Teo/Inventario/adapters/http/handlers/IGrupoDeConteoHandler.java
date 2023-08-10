package com.Teo.Inventario.adapters.http.handlers;

public interface IGrupoDeConteoHandler {

    void saveUser(UsuarioRequestDto usuarioRequestDto);

    void deleteUsuario(UsuarioRequestDto usuarioRequestDto);

    UsuarioResponseDto getUsuario(Long id);




}
