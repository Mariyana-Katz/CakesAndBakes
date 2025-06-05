package com.bakery.CakesAndBakes.exception;

public class OrderRequestNotFoundException extends RuntimeException {
    public OrderRequestNotFoundException(Long id) {
      super("The orderRequest id '" + id + "' does not exist in our records");
    }
}