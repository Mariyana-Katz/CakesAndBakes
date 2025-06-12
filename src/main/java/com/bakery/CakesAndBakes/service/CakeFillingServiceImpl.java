package com.bakery.CakesAndBakes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bakery.CakesAndBakes.entity.CakeFilling;
import com.bakery.CakesAndBakes.repository.CakeFillingRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CakeFillingServiceImpl implements  CakeFillingService {

    private final CakeFillingRepository cakeFillingRepository;
    // Implement methods for CakeFillingService here
    // For example, you might have methods to get all cake fillings, add a new filling, etc.

    // Example method implementation:
    @Override
    public List<CakeFilling> getAllCakeFillings() {
        return cakeFillingRepository.findAll();
    }

    @Override
    public List<CakeFilling> getAllCakeFillings(String cakeFilling) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCakeFillings'");
    }

    @Override
    public CakeFilling getCakeFillingById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCakeFillingById'");
    }
}