package com.bakery.CakesAndBakes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bakery.CakesAndBakes.entity.CustomerOrder;
import com.bakery.CakesAndBakes.exception.CustomerOrderNotFoundException;
import com.bakery.CakesAndBakes.repository.CustomerOrderRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    CustomerOrderRepository customerOrderRepository;

    @Override
    public CustomerOrder getCustomerOrder(Long id) {
        Optional<CustomerOrder> customerOrder = customerOrderRepository.findById(id);
        return unwrapCustomerOrder(customerOrder, id);

    }

    @Override
    public List<CustomerOrder> getAllOrder() {
        return customerOrderRepository.findAll();
    }

    // Helper method that handles the Optional and throws an exception if the cake
    // is not found
    static CustomerOrder unwrapCustomerOrder(Optional<CustomerOrder> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new CustomerOrderNotFoundException(id);
    }
}