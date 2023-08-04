package com.Teo.InventarioInicial.adapters.http.dto.request;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RolRequestDto {
    @Id
    private Long id;
    private RolNombre nombreRol;
    @NotBlank
    private String descripcion;
}
