package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.OrderRequest;

@Repository
public interface OrderRequestRepository extends CrudRepository<OrderRequest, Long> {

    List<OrderRequest> findByEmail(String email);

    List<OrderRequest> findByCakeSize(String cakeSiza);

    List<OrderRequest> findByPhone(String phone);

    Optional<OrderRequest> findById(Long id);

    List<OrderRequest> findAll();

}