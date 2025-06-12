package com.bakery.CakesAndBakes.service;

import java.util.List;

import com.bakery.CakesAndBakes.entity.CakeFilling;

public interface CakeFillingService {

    List<CakeFilling> getAllCakeFillings(String cakeFilling);

    List<CakeFilling> getAllCakeFillings();
    CakeFilling getCakeFillingById(Long id);
}