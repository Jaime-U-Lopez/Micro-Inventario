package com.Teo.Inventario.adapters.http.handlers;



public interface IConciliacionInventarioHandler {

    void saveUser(UsuarioRequestDto usuarioRequestDto);

    void deleteUsuario(UsuarioRequestDto usuarioRequestDto);

    UsuarioResponseDto getUsuario(Long id);




}
