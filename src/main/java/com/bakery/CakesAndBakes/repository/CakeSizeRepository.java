package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.CakeSize;

import jakarta.transaction.Transactional;

@Repository
public interface CakeSizeRepository extends JpaRepository<CakeSize, Long> {

    // For now, it extends JpaRepository to provide basic CRUD operations
    Optional<CakeSize> findById(Long id);

    List<CakeSize> findAll();

    // Custom query to find cake sizes by number of servings
    @Query(value = "SELECT * FROM cake_size WHERE number_of_servings = :servings", nativeQuery = true)
    List<CakeSize> findByNumberOfServings(@Param("servings") String servings);

    @Modifying // This annotation is used to indicate that the method will modify the database
    @Transactional // This annotation is used to indicate that the method should be executed within
                   // a transaction
    @Query(value = "INSERT INTO cake_size (size, number_of_servings) VALUES (:newSize, :servings)", nativeQuery = true)
    int insertCakeSize(// This method is used to insert a new cake size into the database, use int to
                       // return the number of rows affected
            @Param("newSize") String newSize,
            @Param("servings") String servings);

}