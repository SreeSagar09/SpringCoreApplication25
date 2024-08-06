package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.app.Product;

@Configuration
@ComponentScan(basePackages = {"com.app"})
public class AppConfig1 {
	@Bean
	@Lazy //Using Lazy annotation at method level
	public Product iphone() {
		Product product = new Product("Iphone-15Pro", 12, 75000.00, "Applie");
		return product;
	}

	@Bean
	public Product mi() {
		Product product = new Product("Mi-Y2", 12, 25000.00, "Xiomi");
		return product;
	}

	@Bean
	public Product samsung() {
		Product product = new Product("Samsung-Galaxy", 6, 55000.00, "Samsung");
		return product;
	}

	@Lazy //Using Lazy annotation at method level
	@Bean
	public Product oneplus() {
		Product product = new Product("OnePlus-N21", 9, 65000.00, "OnePlus");
		return product;
	}
}
