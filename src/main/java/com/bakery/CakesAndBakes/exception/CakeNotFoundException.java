package com.bakery.CakesAndBakes.exception;

public class CakeNotFoundException extends RuntimeException {

    public CakeNotFoundException(Long id) {
        super("The cake id '" + id + "' does not exist in our records");

    }

    public CakeNotFoundException(String flavor) {
        super("Cake not found with flavor: " + flavor);
    }
}