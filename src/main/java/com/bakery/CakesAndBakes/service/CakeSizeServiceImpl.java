package com.bakery.CakesAndBakes.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import com.bakery.CakesAndBakes.entity.CakeSize;
import com.bakery.CakesAndBakes.repository.CakeSizeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CakeSizeServiceImpl implements CakeSizeService {

    private final CakeSizeRepository cakeSizeRepository;

    @Override
    public List<CakeSize> getAllCakeSizes() {
        return cakeSizeRepository.findAll();
    }
}
