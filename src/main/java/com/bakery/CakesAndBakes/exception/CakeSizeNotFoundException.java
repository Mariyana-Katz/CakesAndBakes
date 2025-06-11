package com.bakery.CakesAndBakes.exception;

public class CakeSizeNotFoundException extends RuntimeException {
 
       public CakeSizeNotFoundException(Long id) {
        super("The cakeSize id '" + id + "' does not exist in our records");
    }
}
