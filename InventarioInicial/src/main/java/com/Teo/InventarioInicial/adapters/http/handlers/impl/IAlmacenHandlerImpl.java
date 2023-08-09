package com.Teo.InventarioInicial.adapters.http.handlers.impl;

import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.http.handlers.IAlmacenHandler;
import com.Teo.InventarioInicial.adapters.http.mapper.IAlmacenRequestMapper;
import com.Teo.InventarioInicial.adapters.http.mapper.IAlmacenResponseMapper;
import com.Teo.InventarioInicial.domain.api.IAlmacenServicePort;
import com.Teo.InventarioInicial.domain.model.Almacen;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IAlmacenHandlerImpl implements IAlmacenHandler {

    private final IAlmacenResponseMapper almacenResponseMapper;
    private final IAlmacenServicePort  almacenServicePort;
    private final IAlmacenRequestMapper  almacenRequestMapper;

    @Override
    public List<AlmacenResponseDto> getAllAlmacenes() {
        return almacenResponseMapper.toResponseList(almacenServicePort.getAllAlmacen());
    }

    @Override
    public void saveAlmacen(AlmacenRequestDto almacenRequestDto) {
        Almacen  almacen =new Almacen(almacenRequestDto.getNombre(), almacenRequestDto.getDireccion());
        almacenServicePort.saveAlmacen(almacen);
    }

    @Override
    public void deleteAlmacen(AlmacenRequestDtoDelete almacenRequestDtoDelete) {
          almacenServicePort.deleteALmacen(almacenRequestDtoDelete.getId());

    }

    @Override
    public AlmacenResponseDto getAlmacen(Long id) {

        return almacenResponseMapper.almacenToAlmacenDTO( almacenServicePort.getAlmacen(id))  ;
    }




}
