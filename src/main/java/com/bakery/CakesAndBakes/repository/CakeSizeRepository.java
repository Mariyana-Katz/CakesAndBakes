package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.CakeSize;

@Repository
public interface CakeSizeRepository extends JpaRepository<CakeSize, Long> {
    // This interface can be used to define custom methods if needed
    // For now, it extends JpaRepository to provide basic CRUD operations
    Optional<CakeSize> findById(Long id);

    CakeSize findBySize(String size);

    List<CakeSize> findAll();

}