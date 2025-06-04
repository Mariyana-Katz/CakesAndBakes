package com.bakery.CakesAndBakes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bakery.CakesAndBakes.entity.Customer;
import com.bakery.CakesAndBakes.repository.CustomerRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
       return customerRepository.findAll();
    }
}