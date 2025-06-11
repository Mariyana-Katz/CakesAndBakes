package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.CakeSize;

@Repository
public interface CakeSizeRepository extends JpaRepository<CakeSize, Long> {
    // This interface can be used to define custom methods if needed
    // For now, it extends JpaRepository to provide basic CRUD operations
    Optional<CakeSize> findById(Long id);

    List<CakeSize> findAll();

    // Custom query to find cake sizes by size
    @Query(value = "SELECT c FROM CakeSize c WHERE c.size = :size")
    List<CakeSize> findBySize(@Param("size") String size);

}