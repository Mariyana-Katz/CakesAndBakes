package com.bakery.CakesAndBakes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.bakery.CakesAndBakes.entity")
@EnableJpaRepositories(basePackages = "com.bakery.CakesAndBakes.repository")
@SpringBootTest
class CakesAndBakesApplicationTests {

	@Test
	void contextLoads() {
	}

}
