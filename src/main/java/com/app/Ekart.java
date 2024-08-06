package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //Using Lay annotation at class level
public class Ekart implements Shipment{
	
	public Ekart() {
		System.out.println("Shipment is Initialized: Ekart");
	}

	@Override
	public void shipmentAgent() {
		System.out.println("Shipment Agent is: Ekart");
	}
	
}
