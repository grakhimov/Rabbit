package com.rabbits.exceptions;

public class CageBadRequestException extends RuntimeException {

    public CageBadRequestException(Long id) {
        super("Cage id not found : " + id);
    }
}