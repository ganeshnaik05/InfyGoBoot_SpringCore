package com.naigan.irs.exception;

public class InvalidPhoneException extends  InfyGoBootException {
    private static final long serialVersionUID = 1L;

    public InvalidPhoneException(String message) {
        super(message);
    }
}
