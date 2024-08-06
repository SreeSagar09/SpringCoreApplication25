package com.app;

public class ECommerSeller {
	private String sellerName;
	private Double rating;
	
	public ECommerSeller(String sellerName, Double rating) {
		this.sellerName = sellerName;
		this.rating = rating;
		
		System.out.println("ECommerSeller is initialized: "+this.sellerName);
	}

	@Override
	public String toString() {
		return "ECommerSeller [sellerName=" + sellerName + ", rating=" + rating + "]";
	}
	
}
