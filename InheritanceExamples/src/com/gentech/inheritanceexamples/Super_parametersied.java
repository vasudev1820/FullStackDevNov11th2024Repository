package com.gentech.inheritanceexamples;
class Car
{
	Car(String Brand,String model)
	{
		System.out.println("The brand of the car is :"+Brand);
		System.out.println("The model of the car is : "+model);
	}
}
class Fuel_Capacity extends Car
{
	String Capacity;
	Fuel_Capacity(String Brand,String model,String Capacity)
	{
		super(Brand, model);
		this.Capacity=Capacity;
		System.out.println("The car has "+ Capacity+"Fuel capacity" );
	}
}

class FuelType extends Fuel_Capacity
{
	String type;
	FuelType(String Brand, String model, String Capacity,String type)
	{
		super(Brand, model, Capacity);
		this.type=type;
		System.out.println("the Fuel type of the car is : "+type);
	}
	
}
public class Super_parametersied 
{
	public static void main(String[] args) 
	{
		 FuelType obj = new FuelType("Rolls-Royce" , "phantom","4 seater","100-Litere");
	}
}
