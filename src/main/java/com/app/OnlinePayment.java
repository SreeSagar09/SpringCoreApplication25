package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //Using Lazy annotation at class level
public class OnlinePayment implements Payment {
	
	public OnlinePayment() {
		System.out.println("Payment is initialized: OnlinePayment");
	}
	
	@Override
	public void paymentMode() {
		System.out.println("Payment is: Online");
	}
}
