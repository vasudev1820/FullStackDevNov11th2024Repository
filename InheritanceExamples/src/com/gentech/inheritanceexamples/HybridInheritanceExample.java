package com.gentech.inheritanceexamples;
class University
{
	void UniversityDratils(String Uni_name,String Uni_loaction)
	{
		System.out.println("the university name is : "+Uni_name);
		System.out.println("the location is :"+Uni_loaction);
	}
}
class College extends University
{
	void collegedetails(String College_name,String College_location)
	{
		System.out.println("the College name is : "+College_name);
		System.out.println("the college location  is : "+College_location);
	}
	
}
class Courses extends College
{
	
	void coursesdeatils(String Courses[])
	{
		for(int i=0;i<Courses.length;i++)
		{
			System.out.println("the courses is : "+Courses[i]);
		}
	}
}
class Student extends Courses
{
	void StudentDeatils(String name,int usn)
	{
		System.out.println("the Student Name is :"+name);
		System.out.println("the Student usn is : "+usn);
	}
}
public class HybridInheritanceExample 
{
	public static void main(String[] args)
	{
		Student obj = new Student();
		obj.UniversityDratils("Vtu", "Belagum");
		obj.collegedetails(" RNS"," Banglore");
		obj.coursesdeatils(new String[] {"mca","mba","cse"});
		obj.StudentDeatils("Jhon",101);
	}
	
}
