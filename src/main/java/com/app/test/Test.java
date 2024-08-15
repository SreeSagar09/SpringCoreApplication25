package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.ECommerSeller;
import com.app.ExchangeTerms;
import com.app.Payment;
import com.app.Product;
import com.app.SellerTypeDetails;
import com.app.Shipment;
import com.app.config.AppConfig1;
import com.app.config.AppConfig2;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig1.class, AppConfig2.class);
		
		System.out.println("Number of Beans: "+applicationContext.getBeanDefinitionCount());
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("----------- Beans Names -----------");
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		
		Product iphone = (Product) applicationContext.getBean("iphone");
		System.out.println(iphone);
		
		Product oneplus = (Product) applicationContext.getBean("oneplus");
		System.out.println(oneplus);
		
		ECommerSeller amazon = (ECommerSeller) applicationContext.getBean("amazon");
		System.out.println(amazon);
		
		Payment onlinePayment = (Payment) applicationContext.getBean("onlinePayment");
		onlinePayment.paymentMode();
		
		Shipment shipment = (Shipment) applicationContext.getBean("delhivery");
		shipment.shipmentAgent();
		
		ExchangeTerms exchangeTerms = (ExchangeTerms) applicationContext.getBean("exchangeTerms");
		
		SellerTypeDetails sellerTypeDetails = (SellerTypeDetails) applicationContext.getBean("sellerTypeDetails");
		
	}
}
