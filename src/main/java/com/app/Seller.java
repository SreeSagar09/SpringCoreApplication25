package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Seller {
	
	@Autowired
	@Lazy
	private ExchangeTerms exchangeTerms;
	
	@Autowired
	private ReturnTerms returnTerms;
	
	private Shipment delhivery;
	private Shipment ekart;
	@Autowired
	@Lazy //Using Lazy annotation at constructor level
	public Seller(Shipment delhivery, Shipment ekart) {
		this.delhivery = delhivery;
		this.ekart = ekart;
	}
	
	private Payment onlinePayment;
	private Payment offlinePayment;
	@Autowired
	//Using Lazy annotation at parameter level
	public void setPayment(@Lazy Payment onlinePayment, Payment offlinePayment) {
		this.onlinePayment = onlinePayment;
		this.offlinePayment = offlinePayment;
	}
	
}
