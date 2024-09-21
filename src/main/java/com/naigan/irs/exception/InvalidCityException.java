package com.naigan.irs.exception;

public class InvalidCityException extends InfyGoBootException {
    private static final long serialVersionUID=1L;

    public InvalidCityException(String message){
        super(message);
    }
}
