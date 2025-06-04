package com.bakery.CakesAndBakes.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(Long id) {
        super("The order id '" + id + "' does not exist in our records");

    }
}