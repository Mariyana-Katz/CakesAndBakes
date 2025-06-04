package com.bakery.CakesAndBakes.exception;

public class CustomerOrderNotFoundException extends RuntimeException {
    public CustomerOrderNotFoundException(Long id) {
        super("The order id '" + id + "' does not exist in our records");

    }
}