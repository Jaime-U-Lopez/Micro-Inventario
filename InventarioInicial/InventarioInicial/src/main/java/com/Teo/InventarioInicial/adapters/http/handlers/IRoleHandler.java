package com.Teo.InventarioInicial.adapters.http.handlers;


import com.pragma.usuariomicroservice.adapters.http.dto.request.RolRequestDto;
import com.pragma.usuariomicroservice.adapters.http.dto.response.RolResponseDto;

import java.util.List;

public interface IRoleHandler {
    List<RolResponseDto> getAllRoles();
    void saveRol(RolRequestDto rolRequestDto);
    void deleteRol(RolResponseDto rolResponseDto);

    RolResponseDto getRol(Long id);

}
