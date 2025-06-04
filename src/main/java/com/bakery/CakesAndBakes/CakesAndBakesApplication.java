package com.bakery.CakesAndBakes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bakery.CakesAndBakes.repository.CakeRepository;
import com.bakery.CakesAndBakes.repository.CustomerRepository;
import com.bakery.CakesAndBakes.repository.CustomerOrderRepository;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class CakesAndBakesApplication {

	@Autowired
	CakeRepository cakeRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CustomerOrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(CakesAndBakesApplication.class, args);
	}

}
