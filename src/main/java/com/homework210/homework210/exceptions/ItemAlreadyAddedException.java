package com.homework210.homework210.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ItemAlreadyAddedException extends RuntimeException{
    public ItemAlreadyAddedException(String exception) {
        super(exception);
    }
}


