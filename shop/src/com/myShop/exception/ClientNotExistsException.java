package com.myShop.exception;

/**
 * Created by hp on 28.11.2016.
 */

public class ClientNotExistsException extends Exception {

    private static final long serialVersionUID = 1L;

    public ClientNotExistsException(String message) {
        super(message);
    }

}