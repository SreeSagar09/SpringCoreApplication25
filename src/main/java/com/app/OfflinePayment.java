package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //Using Lazy annotation at class level
public class OfflinePayment implements Payment {
	
	public OfflinePayment() {
		System.out.println("Payment is initialized: OfflinePayment");
	}

	@Override
	public void paymentMode() {
		System.out.println("Payment is: Offline");
	}

}
