package org.factzoopia.zootopia.exceptions;

public class AnimalsExceptions extends RuntimeException {
    
    public AnimalsExceptions(String message) {
        super(message);
    }

    public AnimalsExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
