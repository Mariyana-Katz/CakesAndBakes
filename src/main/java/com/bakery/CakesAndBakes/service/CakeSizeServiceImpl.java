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

    // This method is used to retrieve all CakeSize entities from the database.
    @Override
    public List<CakeSize> getAllCakeSizes() {
        return cakeSizeRepository.findAll();
    }

    // This method is used to retrieve a CakeSize by its ID, throwing an exception
    // if the CakeSize is not found.
    @Override
    public CakeSize getCakeSizeById(Long id) {
        Optional<CakeSize> cakeSize = cakeSizeRepository.findById(id);
        return unwrapCakeSize(cakeSize, id);

    }

    // This method is used to save a CakeSize entity to the database.
    @Override
    public CakeSize saveCakeSize(CakeSize cakeSize) {
        return cakeSizeRepository.save(cakeSize);
    }

    // This method is used to retrieve a CakeSize by its ID, returning an Optional,
    // part of the native SQL query
    public Optional<CakeSize> getCakeSizesById(Long id) {
        return cakeSizeRepository.findById(id);
    }

    // part of the native SQL query,
    public int addCakeSize(String numberOfServings, String newSize) {
        return cakeSizeRepository.insertCakeSize(newSize, numberOfServings);
    }

   

    // part of the native SQL query, this method retrieves a CakeSize by its number
    // of servings

    public List<CakeSize> getCakeSizeByNumberOfServings(String numberOfServings) {
        return cakeSizeRepository.findByNumberOfServings(numberOfServings);
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