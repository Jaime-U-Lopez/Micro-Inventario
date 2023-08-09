package com.Teo.InventarioInicial.adapters.http.handlers.impl;

import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
import com.Teo.InventarioInicial.adapters.http.handlers.IAlmacenHandler;
import com.Teo.InventarioInicial.adapters.http.handlers.IArticuloHandler;
import com.Teo.InventarioInicial.adapters.http.mapper.IAlmacenRequestMapper;
import com.Teo.InventarioInicial.adapters.http.mapper.IArticuloRequestMapper;
import com.Teo.InventarioInicial.adapters.http.mapper.IArticuloResponseMapper;
import com.Teo.InventarioInicial.adapters.jpa.mysql.entity.AlmacenEntity;
import com.Teo.InventarioInicial.adapters.jpa.mysql.exceptions.AlmacenException;
import com.Teo.InventarioInicial.adapters.jpa.mysql.repository.IAlmacenRepository;
import com.Teo.InventarioInicial.configuration.Constants;
import com.Teo.InventarioInicial.domain.api.IArticuloServicePort;
import com.Teo.InventarioInicial.domain.model.Almacen;
import com.Teo.InventarioInicial.domain.model.Articulo;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IArticuloHandlerImpl implements IArticuloHandler {


private final IArticuloServicePort articuloServicePort;
private final IAlmacenRepository almacenRepository;
private final IAlmacenRequestMapper almacenRequestMapper;
private final IArticuloResponseMapper articuloResponseMapper;
private final IArticuloRequestMapper articuloRequestMapper;
    @Override
    public void saveArticulo(ArticuloRequestDto articuloRequestDto) {

       Long idAlmacen=  articuloRequestDto.getIdAlmacen();
       Optional<AlmacenEntity> optionalAlmacenEntity= almacenRepository.findById(idAlmacen);
       if(optionalAlmacenEntity.isEmpty()){
          throw  new AlmacenException(Constants.ALMACEN_NO_REGISTRADO);
       }

        Articulo articulo = new Articulo(articuloRequestDto.getNombreArticulo(),articuloRequestDto.getCodigoArticulo(),articuloRequestDto.getUbicacion(),articuloRequestDto.getCantidad(), almacenRequestMapper.almacenEntityToAlmacen(optionalAlmacenEntity.get()));

        articuloServicePort.saveArticulo(articulo);
    }

    @Override
    public void deleteArticulo(ArticuloRequestDtoDelete articuloRequestDtoDelete) {


        articuloServicePort.deleteArticulo(articuloRequestDtoDelete.getId() );
    }

    @Override
    public ArticuloResponseDto getArticulo(Long id) {
        return articuloResponseMapper.articuloToArticuloDTO(articuloServicePort.getArticulo(id));
    }

    @Override
    public List<ArticuloResponseDto> getAllArticulo() {
        return articuloResponseMapper.toResponseList(articuloServicePort.getAllArticulo());
    }

}
