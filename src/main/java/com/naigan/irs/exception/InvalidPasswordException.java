package com.naigan.irs.exception;

public class InvalidPasswordException extends InfyGoBootException {
    private static final long serialVersionUID = 1L;

    public InvalidPasswordException(String message) {
        super(message);
    }
}
