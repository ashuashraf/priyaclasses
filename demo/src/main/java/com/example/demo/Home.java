package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {
	private String owner;
	
	private int doorNumber;
	
	@Autowired
	public InternetConnect ic;
	
	public Home() {
		System.out.println("==========hello Spring boot =======");
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public void connect() {
		
		ic.switchOn();
		
		System.out.println("===========connect method executed============");
	}

}
