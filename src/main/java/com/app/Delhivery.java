package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //Using Lay annotation at class level
public class Delhivery implements Shipment{
	
	public Delhivery() {
		System.out.println("Shipment is Initialized: Delhivery");
	}
	
	@Override
	public void shipmentAgent() {
		System.out.println("Shipment Agent is: Delhivery");
	}
	

}
