package com.bakery.CakesAndBakes.service;

import java.util.List;

import com.bakery.CakesAndBakes.entity.OrderRequest;

public interface OrderRequestService {

    OrderRequest getOrderRequest(Long id);

    OrderRequest saveOrderRequest(OrderRequest orderRequest);

    void deleteOrderRequest(Long id);

    List<OrderRequest> getAllOrderRequest();

}