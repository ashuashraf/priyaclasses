package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnect {
	
	
	private  String ipAddress;
	private  String speed;
	
	
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
    public void switchOn() {
    	System.out.println("internet connection is On ");
    }
	

}
