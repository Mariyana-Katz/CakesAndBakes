package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.CakesAndBakes.entity.Cake;
import com.bakery.CakesAndBakes.service.CakeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/cake")
@RestController
public class CakeController {

    private final CakeService cakeService;

    @GetMapping("/{id}")
    public ResponseEntity<Cake> getCake(@PathVariable Long id) {
        return new ResponseEntity<>(cakeService.getCake(id), HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Cake>> getCakes() {
        return new ResponseEntity<>(cakeService.getCakes(), HttpStatus.OK);
    }

    // @GetMapping("/cake/flavor/{flavor}")
    // public ResponseEntity<Cake> getCake(@PathVariable String flavor) {
    //     return new ResponseEntity<>(cakeService.getCake(flavor), HttpStatus.OK);

    // }

}