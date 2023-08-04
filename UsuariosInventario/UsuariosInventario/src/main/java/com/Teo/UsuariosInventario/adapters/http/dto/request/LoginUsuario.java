package com.pragma.usuariomicroservice.adapters.http.dto.request;


import jakarta.validation.constraints.NotBlank;

public class LoginUsuario {
    @NotBlank
    private String correo;
    @NotBlank
    private String password;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
