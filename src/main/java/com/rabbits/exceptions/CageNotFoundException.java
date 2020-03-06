package com.rabbits.exceptions;

public class CageNotFoundException extends RuntimeException {

    public CageNotFoundException(Long id) {
        super("Cage id not found : " + id);
    }
}