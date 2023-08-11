package com.Teo.Inventario.adapters.http.controller;


import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.InventarioInicialResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IInventarioInicialHandler;
import com.Teo.Inventario.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiInventarioInicial/v1")
@RequiredArgsConstructor
public class InventarioInicialRestController {


    private final IInventarioInicialHandler inventarioInicialHandler;

    @Operation(summary = "Create to Inventario Inicial ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Create Almacen returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = InventarioInicialResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
   @PostMapping("/")
    public ResponseEntity<Map<String, String>> createInventarioInicial(@Valid @RequestBody InventarioInicialRequestDto inventarioInicialRequestDto){

        inventarioInicialHandler.saveInventarioInicial(inventarioInicialRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.ENTIDAD_CREADO_MENSAJE)
        );
    }



    @Operation(summary = "Get All InventarioInicial ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "All Inventario returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = InventarioInicialResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/")
    public ResponseEntity<List<InventarioInicialResponseDto>> getAllInventarioInicial(){
         return ResponseEntity.ok(inventarioInicialHandler.getAllInventarioInicial());

    };

    @Operation(summary = "Get  Inventario_Inicial ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Inventario inicial returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = InventarioInicialResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})

    @GetMapping("/{id}")
    public ResponseEntity<InventarioInicialResponseDto> getInventarioInicial(@PathVariable Long id){

    return ResponseEntity.ok(inventarioInicialHandler.getInventarioInicial(id)  );

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteInventarioInicial(@Valid Long  id  ) {
        inventarioInicialHandler.deleteInventarioInicial(id);
        return ResponseEntity.ok(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.ENTIDAD_ElIMINADA_MENSAJE));
    }



}
