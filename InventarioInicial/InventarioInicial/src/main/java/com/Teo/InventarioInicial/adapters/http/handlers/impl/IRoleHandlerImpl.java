package com.Teo.InventarioInicial.adapters.http.handlers.impl;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import com.pragma.usuariomicroservice.adapters.http.dto.request.RolRequestDto;
import com.pragma.usuariomicroservice.adapters.http.dto.response.RolResponseDto;
import com.pragma.usuariomicroservice.adapters.http.exceptions.RolNoExisteTipoRol;
import com.pragma.usuariomicroservice.adapters.http.handlers.IRoleHandler;
import com.pragma.usuariomicroservice.adapters.http.mapper.IRoleRequestMapper;
import com.pragma.usuariomicroservice.adapters.http.mapper.IRoleResponseMapper;
import com.pragma.usuariomicroservice.configuration.Constants;
import com.pragma.usuariomicroservice.domain.api.IRolServicePort;
import com.pragma.usuariomicroservice.domain.model.Rol;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IRoleHandlerImpl implements IRoleHandler {

    private final IRoleResponseMapper roleResponseMapper;
    private final IRolServicePort rolServicePort;
    private final IRoleRequestMapper roleRequestMapper;


    @Override
    public List<RolResponseDto> getAllRoles() {
        return roleResponseMapper.toResponseList(rolServicePort.getAllRoles());
    }


    @Override
    public void saveRol(RolRequestDto rolRequestDto ) {

        RolNombre rol1= RolNombre.R_CLIENTE;
        RolNombre rol2= RolNombre.R_EMPLEADO;
        RolNombre rol3= RolNombre.R_PROPIETARIO;
        RolNombre rol4= RolNombre.R_ADMINISTRADOR;
        if(rol1.equals(rolRequestDto.getNombreRol())||
                rol2.equals(rolRequestDto.getNombreRol())||
                rol3.equals(rolRequestDto.getNombreRol())||
                rol4.equals(rolRequestDto.getNombreRol())){
            Rol rol = roleRequestMapper.toRol(rolRequestDto);
            rolServicePort.saveRole(rol);
        }else{
            throw new RolNoExisteTipoRol(Constants.NO_EXISTE_TIPO_ROL);

        }

    }

    @Override
    public void deleteRol(RolResponseDto rolResponseDto) {
        Rol rol = roleResponseMapper.toRol(rolResponseDto);
        rolServicePort.deleteRole(rol);
    }

    @Override
    public RolResponseDto getRol(Long id) {
        return roleResponseMapper.toRolDTO(rolServicePort.getRole(id));
    }

}
