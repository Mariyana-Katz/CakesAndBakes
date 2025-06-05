package com.bakery.CakesAndBakes.service;

import java.util.List;
import com.bakery.CakesAndBakes.entity.Customer;

public interface CustomerService {

    List<Customer> getCustomers();

    Customer getCustomer(Long id);

}