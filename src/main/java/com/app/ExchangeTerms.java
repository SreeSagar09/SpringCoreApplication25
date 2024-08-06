package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //Using Lay annotation at class level
public class ExchangeTerms {
	public ExchangeTerms() {
		System.out.println("Exchange with in: 1(Days)");
	}
}
