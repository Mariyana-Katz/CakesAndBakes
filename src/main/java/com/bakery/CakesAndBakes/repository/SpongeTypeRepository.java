package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.SpongeType;

@Repository
public interface SpongeTypeRepository extends JpaRepository<SpongeType, Long> {

    SpongeType findBySpongeType(String spongeType);

    Optional<SpongeType> findById(Long id);// Optional return type for findById, to avoid null checks

    List<SpongeType> findAll();
}
