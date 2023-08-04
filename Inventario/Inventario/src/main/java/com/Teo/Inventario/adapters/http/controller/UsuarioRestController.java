package com.Teo.Inventario.adapters.http.controller;

import com.pragma.usuariomicroservice.adapters.http.dto.request.UsuarioRequestDto;
import com.pragma.usuariomicroservice.adapters.http.handlers.IUsuarioHandler;
import com.pragma.usuariomicroservice.configuration.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/apiUser/v1")
@RequiredArgsConstructor
public class UsuarioRestController {
    @Autowired
    PasswordEncoder passwordEncoder;
    private final IUsuarioHandler usuarioHandler;

    @Operation(summary = "Crear un nuevo user ",
    responses = {
            @ApiResponse(responseCode = "201", description = "Creacion de usuarios ",
            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
            @ApiResponse(responseCode = "409", description = "Propietario ya existente",
                    content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))
    })
    @PostMapping("/usuario")
    public ResponseEntity<Map<String, String>> createUser(@Valid @RequestBody UsuarioRequestDto usuarioRequestDto){

        // Codificar la contraseña utilizando BCryptPasswordEncoder
        String encodedPassword = passwordEncoder.encode(usuarioRequestDto.getPassword());
        usuarioRequestDto.setPassword(encodedPassword);
        usuarioHandler.saveUser(usuarioRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.PROPIETARIO_CREADO_MENSAJE)
        );
    }
/*



    @GetMapping("/usuarios/{id}")
    public Boolean validarRolPropietario(@PathVariable("id") Long id){
        return usuarioHandler.validarUser(id);
    }

 */

    @Operation(summary = "Elimine un usuario ",
            responses = {
                    @ApiResponse(responseCode = "200", description = "User deleted",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "404", description = "User not found",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @DeleteMapping("")
    public ResponseEntity<Map<String, String>> deleteUser(@RequestBody UsuarioRequestDto usuarioRequestDto) {
        usuarioHandler.deleteUsuario(usuarioRequestDto);
        return ResponseEntity.ok(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.USUARIO_ELIMINADO_CON_EXITO));
    }



}
