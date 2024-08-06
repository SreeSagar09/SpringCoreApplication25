package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.app.ECommerSeller;

@Configuration
@Lazy //Using Lazy annotation at class level
public class AppConfig2 {
	@Bean
	public ECommerSeller amazon() {
		ECommerSeller eCommerSeller = new ECommerSeller("Amazon", 4.5);
		return eCommerSeller;
	}
	
	@Bean
	public ECommerSeller flipkart() {
		ECommerSeller eCommerSeller = new ECommerSeller("Flipkart", 3.9);
		return eCommerSeller;
	}
	
	@Bean
	@Lazy(value = false)
	public ECommerSeller myntra() {
		ECommerSeller eCommerSeller = new ECommerSeller("Myntra", 4.2);
		return eCommerSeller;
	}
}
