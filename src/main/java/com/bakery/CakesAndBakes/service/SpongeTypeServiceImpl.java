package com.bakery.CakesAndBakes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bakery.CakesAndBakes.entity.SpongeType;
import com.bakery.CakesAndBakes.exception.SpongeTypeNotFoundException;
import com.bakery.CakesAndBakes.repository.SpongeTypeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SpongeTypeServiceImpl implements SpongeTypeService {

    private final SpongeTypeRepository spongeTypeRepository;

    @Override
    public List<SpongeType> getAllSpongeTypes() {
        return spongeTypeRepository.findAll();
    }

    @Override
    public SpongeType getSpongeTypeById(Long id) {
        Optional<SpongeType> spongeType = spongeTypeRepository.findById(id);
        return unwrapSpongeType(spongeType, id);
    }

    @Override
    public SpongeType saveSpongeType(SpongeType spongeType) {
        return spongeTypeRepository.save(spongeType);
    }

    // Helper method that handles the Optional and throws an exception if the cake
    // is not found
    static SpongeType unwrapSpongeType(Optional<SpongeType> entity, Long id) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new SpongeTypeNotFoundException(id);
    }

}