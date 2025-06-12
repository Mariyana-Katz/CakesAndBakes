package com.bakery.CakesAndBakes.service;

import java.util.List;

import com.bakery.CakesAndBakes.entity.SpongeType;

public interface SpongeTypeService {

    List<SpongeType> getAllSpongeTypes();
    SpongeType getSpongeTypeById(Long id);
    SpongeType saveSpongeType(SpongeType spongeType);
}