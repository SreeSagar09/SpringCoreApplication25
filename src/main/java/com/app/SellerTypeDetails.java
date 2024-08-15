package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SellerTypeDetails {
	
	@Autowired
	private RetailSellerType retailSellerType;
	
	@Autowired
	private WholeSaleSellerType wholeSaleSellerType;
}
