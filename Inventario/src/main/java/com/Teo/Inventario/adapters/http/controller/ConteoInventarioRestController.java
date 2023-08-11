package com.Teo.Inventario.adapters.http.controller;


import com.Teo.Inventario.adapters.http.dto.request.ConteoInventarioRequestDto;
import com.Teo.Inventario.adapters.http.dto.request.InventarioInicialRequestDto;
import com.Teo.Inventario.adapters.http.dto.response.ConteoInventarioResponseDto;
import com.Teo.Inventario.adapters.http.dto.response.InventarioInicialResponseDto;
import com.Teo.Inventario.adapters.http.handlers.IConteoInventarioHandler;
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
@RequestMapping("/apiConteoInventario/v1")
@RequiredArgsConstructor
public class ConteoInventarioRestController {

    private final IConteoInventarioHandler conteoInventarioHandler;


    @Operation(summary = "Create to Conteo Inventario ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Create Almacen returned",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = InventarioInicialResponseDto.class)))),
                    @ApiResponse(responseCode = "404", description = "No data found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping("/")
    public ResponseEntity<Map<String, String>> createConteoInventario(@Valid @RequestBody ConteoInventarioRequestDto conteoInventarioRequestDto){

        conteoInventarioHandler.saveConteoInventario(conteoInventarioRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.ENTIDAD_CREADO_MENSAJE)
        );
    }


    @GetMapping("/")
    public ResponseEntity<List<ConteoInventarioResponseDto>> getAllConteoInventario(){

        return ResponseEntity.ok(conteoInventarioHandler.getAllConteoInventario());
    }





    @GetMapping("/{id}")
    public ResponseEntity<ConteoInventarioResponseDto> getAllConteoInventario(@PathVariable Long id){

        return ResponseEntity.ok(conteoInventarioHandler.getConteoInventario(id));

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteConteoInventario(@Valid Long  id  ) {
        conteoInventarioHandler.deleteConteoInventario(id);
        return ResponseEntity.ok(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.ENTIDAD_ElIMINADA_MENSAJE));
    }

}
