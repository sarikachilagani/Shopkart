package com.springboot.shopkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.springboot.shopkart")
@EntityScan({"com.springboot.shopkart.model"})
@EnableJpaRepositories({"com.springboot.shopkart.repo"})
public class ShopkartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopkartApplication.class, args);
	}

}
