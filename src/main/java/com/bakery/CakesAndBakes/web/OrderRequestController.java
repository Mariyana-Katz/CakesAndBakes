package com.bakery.CakesAndBakes.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping("/{id}")
    public ResponseEntity<OrderRequest> getOrderRequest(@PathVariable Long id) {
        return new ResponseEntity<>(orderRequestService.getOrderRequest(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<OrderRequest> saveOrderRequest(@Valid @RequestBody OrderRequest orderRequest){
    return new ResponseEntity<>(orderRequestService.saveOrderRequest(orderRequest), HttpStatus.CREATED);}

}