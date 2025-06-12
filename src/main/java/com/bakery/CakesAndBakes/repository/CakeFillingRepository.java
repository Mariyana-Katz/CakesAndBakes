package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.CakeFilling;


@Repository
public interface CakeFillingRepository extends JpaRepository<CakeFilling, Long> {

    Optional<CakeFilling> findById(Long id);

    List<CakeFilling> findAll();

    List<CakeFilling> findBycakeFilling(String flavor);


}