package com.github.facestac.exceptions;

public class PlayerExistsException extends RuntimeException {

    public PlayerExistsException(String message) {
        super(message);
    }

    public PlayerExistsException(int id) {
        super(String.format("Player with id %d already exists", id));
    }

    public PlayerExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerExistsException(Throwable cause) {
        super(cause);
    }

    public PlayerExistsException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
