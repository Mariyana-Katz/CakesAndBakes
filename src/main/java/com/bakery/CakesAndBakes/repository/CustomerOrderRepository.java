package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.CustomerOrder;


@Repository
public interface CustomerOrderRepository extends CrudRepository <CustomerOrder, Long> {


    Optional <CustomerOrder> findById(Long id);
     List<CustomerOrder> findAll();

}