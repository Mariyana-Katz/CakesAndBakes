package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.CustomerOrder;


@Repository
public interface CustomerOrderRepository extends JpaRepository <CustomerOrder, Long> {


    Optional <CustomerOrder> findById(Long id);
     List<CustomerOrder> findAll();

}