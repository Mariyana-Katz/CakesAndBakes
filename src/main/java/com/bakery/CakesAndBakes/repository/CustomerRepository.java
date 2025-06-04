package com.bakery.CakesAndBakes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bakery.CakesAndBakes.entity.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List <Customer> findByEmail(String email);

    List<Customer> findByName(String name);

    List<Customer> findByPhone(String phone);

    List<Customer> findAll();

}