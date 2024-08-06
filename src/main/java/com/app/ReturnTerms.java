package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //Using Lay annotation at class level
public class ReturnTerms {
	public ReturnTerms() {
		System.out.println("Return with in: 15(Days)");
	}
}
