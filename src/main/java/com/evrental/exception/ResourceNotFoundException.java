package com.evrental.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String entity, String field, Long value) {
        super(String.format("%s not found with %s : '%s'", entity, field, value));
    }
}
