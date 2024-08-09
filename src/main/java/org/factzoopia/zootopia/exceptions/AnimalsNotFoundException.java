package org.factzoopia.zootopia.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Animal not found...")

public class AnimalsNotFoundException extends AnimalsExceptions {

    public AnimalsNotFoundException(String message) {
        super(message);
    }
    
    public AnimalsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
