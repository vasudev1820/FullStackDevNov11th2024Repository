package com.gentech.inheritanceexamples;
class Bike
{
	String brand;
	String model;
	Bike(String brand, String model) 
	 {
		 this.brand=brand;
		 this.model=model;
		 System.out.println("The brand of the bike is: " + brand);
		 System.out.println("The model of the bike is: " + model);
	 }
	 
	 Bike(String brand, String model, String type, int gears) 
	 {
	        this(brand, model);  
	        System.out.println("The bike has " + gears + " gears.");
	 }
}

class Sportsbike extends Bike
{
	int EngineCapcity;
	Sportsbike(String brand, String model, int gears,int EngineCapcity)
	{
		super(brand, model);
		this.EngineCapcity = EngineCapcity;
        System.out.println("The sport bike has an engine capacity of " + EngineCapcity + "cc.");
	}
	
}

class Electricbike extends Sportsbike
{
	int battery_capacity;
	Electricbike(String brand, String model, int gears, int EngineCapcity,int battery_capacity) 
	{
		super(brand, model, gears, EngineCapcity);
		this.battery_capacity=battery_capacity;
		System.out.println("The electric bike has a battery capacity of " + battery_capacity+"Ah");
	}
	
}
public class SuperConstructorOverLoading 
{
	public static void main(String[] args) 
	{
		Electricbike bike = new Electricbike("Yamaha", "YZF-R1", 6, 1000, 30);
	}

}
