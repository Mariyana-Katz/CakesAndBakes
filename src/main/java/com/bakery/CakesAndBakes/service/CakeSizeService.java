package com.bakery.CakesAndBakes.service;

import java.util.List;

import com.bakery.CakesAndBakes.entity.CakeSize;

public interface CakeSizeService {

    List<CakeSize> getAllCakeSizes();

    CakeSize getCakeSizeById(Long id);

    CakeSize saveCakeSize(CakeSize cakeSize);
}