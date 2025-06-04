package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.CakesAndBakes.entity.CustomerOrder;
import com.bakery.CakesAndBakes.service.CustomerOrderService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/customerOrder")
@RestController
public class CustomerOrderController {

    private final CustomerOrderService customerOrderService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerOrder> getCustomerOrder(@PathVariable Long id) {
        return new ResponseEntity<>(customerOrderService.getCustomerOrder(id), org.springframework.http.HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CustomerOrder>> getAllOrders() {
        return new ResponseEntity<>(customerOrderService.getAllOrder(), HttpStatus.OK);
    }

}