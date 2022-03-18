package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigure {
	

	@Bean
	public Item getItem()
	{
		return new ItemImp1();
	}
	
	@Bean
	public Product getProd()
	{
		return new ProductImp1();
	}
	
	
	@Bean
	public Store testingStore()
	{
		Store store = new Store();
		store.setItem(getItem());
		store.setProduct(getProd());
		
		return store;
	}

}
