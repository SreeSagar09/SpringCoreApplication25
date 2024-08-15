package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class WholeSaleSellerType {
	public WholeSaleSellerType() {
		System.out.println("SellerType is initialized: WholeSaleSellerType");
	}
}
