package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyerTypeDetails {
	
	@Autowired
	private RetailBuyer retailBuyer;
	
	@Autowired
	private WholeSaleBuyer wholeSaleBuyer;
}
