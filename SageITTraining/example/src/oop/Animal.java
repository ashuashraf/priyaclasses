package oop;

public class Animal extends Bird{
	    public static void main(String[] args) {
	        Animal a=new Animal();
	                a.walk();
	                Bird.fly();
	        Bird b=new Bird();
	        b.sing();
	    }
	 
	    public void walk()
	    {
	        System.out.println("i am walking");
	    }
	 
	}
	  class Bird 
	 {
	    public static void fly()
	    {
	        System.out.println("i am flying");
	    }
	     public void sing() {
	    	 System.out.println("i am singing");
	     }

	 }
