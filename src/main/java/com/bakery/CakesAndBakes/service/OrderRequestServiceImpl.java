package com.bakery.CakesAndBakes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bakery.CakesAndBakes.entity.OrderRequest;
import com.bakery.CakesAndBakes.exception.OrderRequestNotFoundException;
import com.bakery.CakesAndBakes.repository.OrderRequestRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderRequestServiceImpl implements OrderRequestService {

    OrderRequestRepository orderRequestRepository;

    @Override
    public OrderRequest getOrderRequest(Long id) {
        Optional<OrderRequest> orderRequest = orderRequestRepository.findById(id);
        return unwrapOrderRequest(orderRequest, id);

    }

    @Override
    public OrderRequest saveOrderRequest(OrderRequest orderRequest) {
        return orderRequestRepository.save(orderRequest);
    }

    @Override
    public void deleteOrderRequest(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteOrderRequest'");
    }

    @Override
    public List<OrderRequest> getAllOrderRequest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllOrderRequest'");
    }

    // Helper method that handles the Optional and throws an exception if the cake
    // is not found
    static OrderRequest unwrapOrderRequest(Optional<OrderRequest> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new OrderRequestNotFoundException(id);
    }

    // part of the native SQL query
    public List<OrderRequest> getOrderRequestByCakeFillingAndCakeSize(String cakeSize, String cakeFilling) {
        return orderRequestRepository.getByFillingAndSize(cakeFilling, cakeSize);
    }

    public List<OrderRequest> getOrderRequestByCakeFillingSizeAndSponge(String cakeSize, String cakeFilling,
            String spongeType) {
        return orderRequestRepository.getByFillingSizeAndSpongeType(cakeSize, cakeFilling, spongeType);
    }

}