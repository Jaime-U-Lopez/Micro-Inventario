package com.Teo.InventarioInicial.adapters.http.controller;

import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.ArticuloRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.http.dto.response.ArticuloResponseDto;
import com.Teo.InventarioInicial.adapters.http.handlers.IAlmacenHandler;
import com.Teo.InventarioInicial.adapters.http.handlers.IArticuloHandler;
import com.Teo.InventarioInicial.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Articulo/v1")
@RequiredArgsConstructor
@SecurityRequirement(name = "jwt")
public class ArticuloRestController {
    private final IArticuloHandler articuloHandler;

    @Operation(summary = "Get All Articulo ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "All Articulo returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = ArticuloResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/")
    public ResponseEntity<List<ArticuloResponseDto>> getAllArticulo() {
        return ResponseEntity.ok(articuloHandler.getAllArticulo());
    }


    @Operation(summary = "Get articulo by id ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Articulo by id returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = ArticuloResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/{id}")
    public ResponseEntity<ArticuloResponseDto> getAlmacenes(@PathVariable Long id) {
        return ResponseEntity.ok(articuloHandler.getArticulo(id));
    }


    @Operation(summary = "Create to Articulo",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Create Articulo returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = ArticuloRequestDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping("/")
    public ResponseEntity<Map<String, String>>  createArticulo(@Valid @RequestBody ArticuloRequestDto requestDto ) {
        articuloHandler.saveArticulo(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.ARTICULO_CREADO_CON_EXITO)
        );
    }


    @Operation(summary = "Delete to Articulo ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Almacen deleted",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "404", description = "Almacen not found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})

    @DeleteMapping("")
    public ResponseEntity<Map<String, String>> deleteArticulo(@Valid @RequestBody ArticuloRequestDtoDelete requestDto  ) {
        articuloHandler.deleteArticulo(requestDto);
        return ResponseEntity.ok(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.ARTICULO_ELIMINADO_CON_EXITO ));
    }



}
