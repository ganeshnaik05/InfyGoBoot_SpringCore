package com.naigan.irs.exception;

public class InvalidUserIdException extends InfyGoBootException {
    private static final long serialVersionUID = 1L;

    public InvalidUserIdException(String message) {
        super(message);
    }
}
