package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bakery.CakesAndBakes.entity.CakeSize;
import com.bakery.CakesAndBakes.service.CakeSizeService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/cakeSize")
@RestController
public class CakeSizeController {

    private final CakeSizeService cakeSizeService;

    @GetMapping("/all")
    public ResponseEntity<List<CakeSize>> getAllCakeSizes() {
        return new ResponseEntity<>(cakeSizeService.getAllCakeSizes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CakeSize> getCakeSizeById(Long id) {
        return new ResponseEntity<>(cakeSizeService.getCakeSizeById(id), HttpStatus.OK);
    }

    // part of the native query to search for cake sizes by id
    @GetMapping("/search")
    public ResponseEntity<CakeSize> getCakeSizesById(@RequestParam Long id) {
        CakeSize cakeSize = cakeSizeService.getCakeSizeById(id);
        return new ResponseEntity<>(cakeSize, HttpStatus.OK);

    }
}
