package com.example.demo;

public class Store {

	Item item;
	
	Product product;
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void getStore()
	{
		System.out.println("=========Store========");
		
		item.testItem();
		
		product.getProductDetails();
	}
	
}