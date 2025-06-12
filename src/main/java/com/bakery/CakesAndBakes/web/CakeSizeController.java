package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    // This method retrieves all cake sizes from the database.
    // It returns a list of CakeSize objects wrapped in a ResponseEntity with an
    // HTTP status of OK (200).
    @GetMapping("/all")
    public ResponseEntity<List<CakeSize>> getAllCakeSizes() {
        return new ResponseEntity<>(cakeSizeService.getAllCakeSizes(), HttpStatus.OK);
    }

    // This method retrieves a cake size by its ID.
    @GetMapping("/{id}")
    public ResponseEntity<CakeSize> getCakeSizeById(Long id) {
        return new ResponseEntity<>(cakeSizeService.getCakeSizeById(id), HttpStatus.OK);
    }

    // part of the native query to search for cake sizes by id
    @GetMapping("/search")
    public ResponseEntity<CakeSize> getCakeSizesById(@RequestParam Long id) {
        // This method retrieves a cake size by its id.
        return new ResponseEntity<>(cakeSizeService.getCakeSizeById(id), HttpStatus.OK);

    }

    // part of the native query to search for cake sizes by number of servings.
    // Returns a list of CakeSize objects.
    // Retrieves cake sizes by number of servings.
    @GetMapping("/search/numberOfServings")
    public ResponseEntity<List<CakeSize>> getCakeSizesByNumberOfServings(@RequestParam String numberOfServings) {
        List<CakeSize> cakeSizes = cakeSizeService.getCakeSizeByNumberOfServings(numberOfServings);
        return new ResponseEntity<>(cakeSizes, HttpStatus.OK);
    }

    // // Handles POST requests to add a new cake size, part of the native SQL
    // query. Returns a int indicating the number of rows affected. It is not a
    // standard RESTful practice to return an int, but it is used here
    // // to indicate the success of the operation.
    // Usually, you would return a CakeSize object or a success message.
    // This method adds a new cake size to the database.
    @PostMapping("/add")
    public ResponseEntity<String> addCakeSize(@RequestParam String numberOfServings,
            @RequestParam String newSize) {
        int result = cakeSizeService.addCakeSize(numberOfServings, newSize);
        if (result > 0) {
            return new ResponseEntity<>("Cake size added successfully!", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to add cake size.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
