package com.naigan.irs.exception;

public class UserAlreadyPresentException  extends  InfyGoBootException{

    private static final long serialVersionUID = 1L;

    public UserAlreadyPresentException(String message) {
        super(message);
    }
}
