package com.naigan.irs.exception;

public class InvalidNameException extends InfyGoBootException{
    private static final long serialVersionUID = 1L;

    public InvalidNameException(String message) {
        super(message);
    }
}
