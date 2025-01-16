package com.gentech.inheritanceexamples;
class Employee
{
	void employeeDetails(String name,int salary)
	{
		System.out.println("Name of the Employee : "+name);
		System.out.println("salary of the Employee : "+salary);
	}
}
class Department extends Employee
{
	void DepartmentDeatils(String Dept_name,int Dept_id)
	{
		System.out.println("the Department name : "+Dept_name);
		System.out.println("the Department id is : "+Dept_id);
	}
}

class Manager extends Department
{
	void ManagerDetails(String Manager_name,int Manager_id)
	{
		System.out.println("the manager name is : "+Manager_name);
		System.out.println("the manager id is : "+Manager_id);
	}
}

public class MultilevelDemo 
{
	public static void main(String[] args) 
	{
		Manager obj=new Manager();
		obj.employeeDetails("jhon", 18000);
		obj.DepartmentDeatils("Hr",101);
		obj.ManagerDetails("james",5001);

	}

}
