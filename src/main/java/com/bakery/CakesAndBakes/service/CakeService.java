package com.bakery.CakesAndBakes.service;

import java.util.List;

import com.bakery.CakesAndBakes.entity.Cake;

public interface CakeService {
    Cake getCake(Long id);

    Cake saveCake(Cake cake);

    void deleteCake(Long id);

    List<Cake> getCakes();

}