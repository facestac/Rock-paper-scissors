package com.github.facestac.exception;

import java.io.IOException;

public class FileNotFoundException extends IOException {
    public FileNotFoundException(String message) {
        super(message);
    }
}
