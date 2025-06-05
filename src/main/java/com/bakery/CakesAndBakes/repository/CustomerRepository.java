package com.bakery.CakesAndBakes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByEmail(String email);

    List<Customer> findByName(String name);

    List<Customer> findByPhone(String phone);

    Optional<Customer> findById(Long id);

    List<Customer> findAll();

}