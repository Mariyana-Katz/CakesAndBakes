package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.CakesAndBakes.entity.OrderRequest;
import com.bakery.CakesAndBakes.service.OrderRequestService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/orderRequest")
@RestController
public class OrderRequestController {

    OrderRequestService orderRequestService;

    // method to get a order request by id.
    @GetMapping("/{id}")
    public ResponseEntity<OrderRequest> getOrderRequest(@PathVariable Long id) {
        return new ResponseEntity<>(orderRequestService.getOrderRequest(id), HttpStatus.OK);
    }

    // Post request to save a new order request.
    // This method handles the creation of a new order request.
    @PostMapping
    public ResponseEntity<OrderRequest> saveOrderRequest(@Valid @RequestBody OrderRequest orderRequest) {
        return new ResponseEntity<>(orderRequestService.saveOrderRequest(orderRequest), HttpStatus.CREATED);
    }

    // Handles GET requests to search for custom cake orders based on
    // both cake size and cake filling. Part of the native SQL query.
    @GetMapping("/search")
    public ResponseEntity<List<OrderRequest>> getOrderRequestBycakeFillingAndCakeSize(@RequestParam String cakeSize,
            @RequestParam String cakeFilling) {
        List<OrderRequest> customOrders = orderRequestService.getOrderRequestByCakeFillingAndCakeSize(cakeSize,
                cakeFilling);
        return new ResponseEntity<>(customOrders, HttpStatus.OK);
    }

    // Handles GET requests to search for custom cake orders based on
    // cake size, cake filling, and sponge type. Part of the native SQL query.
    @GetMapping("/search/with-sponge")
    public ResponseEntity<List<OrderRequest>> getOrderRequestByCakeFillingSizeAndSponge(@RequestParam String cakeSize,
            @RequestParam String cakeFilling, @RequestParam String spongeType) {
        List<OrderRequest> customOrders = orderRequestService.getOrderRequestByCakeFillingSizeAndSponge(cakeSize,
                cakeFilling, spongeType);
        return new ResponseEntity<>(customOrders, HttpStatus.OK);
    }

}