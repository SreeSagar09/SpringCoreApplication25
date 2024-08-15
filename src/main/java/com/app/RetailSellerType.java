package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RetailSellerType {
	public RetailSellerType() {
		System.out.println("SellerType is initialized: RetailSellerType");
	}
}
