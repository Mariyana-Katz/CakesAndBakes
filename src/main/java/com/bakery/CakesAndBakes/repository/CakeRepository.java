package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.Cake;


@Repository
public interface CakeRepository extends CrudRepository<Cake, Long> {
  
    Optional<Cake> findById(Long id);
      List<Cake> findByFlavor(String flavor);
      List<Cake> findAll();
    
      

}