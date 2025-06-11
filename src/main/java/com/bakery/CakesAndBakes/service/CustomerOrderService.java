package com.bakery.CakesAndBakes.service;

import java.util.List;

import com.bakery.CakesAndBakes.entity.CustomerOrder;

public interface CustomerOrderService {

    CustomerOrder getCustomerOrder(Long id);

    List<CustomerOrder> getAllOrder();

}