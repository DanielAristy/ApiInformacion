package com.example.apiinformacion.exception;

public class NoExisteException extends RuntimeException {

    public NoExisteException(String mensaje){
        super(mensaje);
    }
}
