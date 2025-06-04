package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.CakesAndBakes.entity.Customer;
import com.bakery.CakesAndBakes.service.CustomerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getCustomers() {
        return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);
    }
}