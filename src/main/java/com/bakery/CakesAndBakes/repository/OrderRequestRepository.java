package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.OrderRequest;

@Repository
public interface OrderRequestRepository extends JpaRepository<OrderRequest, Long> {

    List<OrderRequest> findByEmail(String email);

    List<OrderRequest> findByCakeSize(String cakeSiza);

    List<OrderRequest> findByPhone(String phone);

    Optional<OrderRequest> findById(Long id);

    List<OrderRequest> findAll();

    // Custom query to find orders by cake size and filling
    @Query(value = "SELECT * FROM order_request WHERE cake_size = :cakeSize AND cake_filling = :cakeFilling", nativeQuery = true)
    List<OrderRequest> getByFillingAndSize(@Param("cakeSize") String cakeSize,
            @Param("cakeFilling") String cakeFilling);

    // Custom query to find orders by cake size, filling, and sponge type
    @Query(value = " SELECT * FROM order_request WHERE cake_size = :cakeSize AND cake_filling = :cakeFilling AND sponge_type = :spongeType", nativeQuery = true)
    List<OrderRequest> getByFillingSizeAndSpongeType(@Param("cakeSize") String cakeSize,
            @Param("cakeFilling") String cakeFilling,
            @Param("spongeType") String spongeType);

}