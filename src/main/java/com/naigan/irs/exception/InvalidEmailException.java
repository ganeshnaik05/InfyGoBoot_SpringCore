package com.naigan.irs.exception;

public class InvalidEmailException extends  InfyGoBootException {
    private static final long serialVersionUID = 1L;

    public InvalidEmailException(String message) {
        super(message);
    }
}
