package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.CakesAndBakes.entity.CakeFilling;
import com.bakery.CakesAndBakes.service.CakeFillingService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/cakeFilling")
public class CakeFillingController {

   private final CakeFillingService cakeFillingService;

   @GetMapping("/all")
   public ResponseEntity<List<CakeFilling>> getAllCakeFillings() {
       // This method retrieves all cake fillings from the database.
       // It returns a list of CakeFilling objects wrapped in a ResponseEntity with an
       // HTTP status of OK (200).
       return new ResponseEntity<>(cakeFillingService.getAllCakeFillings(), HttpStatus.OK);
   }
}