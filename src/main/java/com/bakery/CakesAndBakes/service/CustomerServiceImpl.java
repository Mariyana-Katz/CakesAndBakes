package com.bakery.CakesAndBakes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bakery.CakesAndBakes.entity.Customer;
import com.bakery.CakesAndBakes.exception.CustomerNotFoundException;
import com.bakery.CakesAndBakes.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return unwrapCustomer(customer, id);
    }

    // Helper method that handles the Optional and throws an exception if the cake
    // is not found
    static Customer unwrapCustomer(Optional<Customer> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new CustomerNotFoundException(id);
    }
}