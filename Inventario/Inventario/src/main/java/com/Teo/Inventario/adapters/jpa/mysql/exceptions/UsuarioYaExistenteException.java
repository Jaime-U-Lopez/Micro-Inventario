package com.Teo.Inventario.adapters.jpa.mysql.exceptions;

public class UsuarioYaExistenteException extends RuntimeException{

    public UsuarioYaExistenteException(String message) {
        super(message);
    }
}
