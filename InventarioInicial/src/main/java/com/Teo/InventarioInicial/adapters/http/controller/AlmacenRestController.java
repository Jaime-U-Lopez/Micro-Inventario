package com.Teo.InventarioInicial.adapters.http.controller;

import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDto;
import com.Teo.InventarioInicial.adapters.http.dto.request.AlmacenRequestDtoDelete;
import com.Teo.InventarioInicial.adapters.http.dto.response.AlmacenResponseDto;
import com.Teo.InventarioInicial.adapters.http.handlers.IAlmacenHandler;
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
@RequestMapping("/Almacen/v1")
@RequiredArgsConstructor
@SecurityRequirement(name = "jwt")
public class AlmacenRestController {
    private final IAlmacenHandler almacenHandler;

    @Operation(summary = "Get All Almacenes ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "All Almacenes returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = AlmacenResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/")
    public ResponseEntity<List<AlmacenResponseDto>> getAllAlmacenes() {
        return ResponseEntity.ok(almacenHandler.getAllAlmacenes());
    }


    @Operation(summary = "Get Almacen by id ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Almacen by id returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = AlmacenResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/{id}")
    public ResponseEntity<AlmacenResponseDto> getAlmacenes(@PathVariable Long id) {
        return ResponseEntity.ok(almacenHandler.getAlmacen(id));
    }

    @Operation(summary = "Create to Almacenes ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Create Almacen returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = AlmacenResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping("/")
    public ResponseEntity<Map<String, String>>  createAlmacen(@Valid @RequestBody AlmacenRequestDto requestDto ) {
        almacenHandler.saveAlmacen(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.ALMACEN_CREADO_CON_EXITO)
        );
    }


    @Operation(summary = "Delete to Almacen ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Almacen deleted",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "404", description = "Almacen not found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})

    @DeleteMapping("")
    public ResponseEntity<Map<String, String>> deleteAlmacen(@RequestBody AlmacenRequestDtoDelete almacenRequestDtoDelete) {
        almacenHandler.deleteAlmacen(almacenRequestDtoDelete);
        return ResponseEntity.ok(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.ALMACEN_ELIMINADO_CON_EXITO));
    }



}
