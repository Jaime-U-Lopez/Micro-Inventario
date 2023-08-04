package com.pragma.usuariomicroservice.adapters.http.dto.request;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


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
