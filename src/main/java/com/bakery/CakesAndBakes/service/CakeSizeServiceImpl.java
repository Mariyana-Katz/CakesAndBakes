package com.bakery.CakesAndBakes.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import com.bakery.CakesAndBakes.entity.CakeSize;
import com.bakery.CakesAndBakes.exception.CakeSizeNotFoundException;
import com.bakery.CakesAndBakes.repository.CakeSizeRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CakeSizeServiceImpl implements CakeSizeService {

    private final CakeSizeRepository cakeSizeRepository;

    @Override
    public List<CakeSize> getAllCakeSizes() {
        return cakeSizeRepository.findAll();
    }

    @Override
    public CakeSize getCakeSizeById(Long id) {
        Optional<CakeSize> cakeSize = cakeSizeRepository.findById(id);
        return unwrapCakeSize(cakeSize, id);

    }

    @Override
    public CakeSize saveCakeSize(CakeSize cakeSize) {
        return cakeSizeRepository.save(cakeSize);
    }

    public Optional<CakeSize> getCakeSizesById(Long id) {
        return cakeSizeRepository.findById(id);
    }

    // Helper method that handles the Optional and throws an exception if the cake
    // is not found
    static CakeSize unwrapCakeSize(Optional<CakeSize> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new CakeSizeNotFoundException(id);
    }
}