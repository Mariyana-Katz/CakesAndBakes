package com.bakery.CakesAndBakes.exception;

public class SpongeTypeNotFoundException extends RuntimeException {
    public SpongeTypeNotFoundException(Long id) {
        super("The spongeType id '" + id + "' does not exist in our records");

    }
}