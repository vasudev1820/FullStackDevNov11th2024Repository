package com.gentech.inheritanceexamples;
class Employement
{
    void showEname(String Ename)
    {
        System.out.println("Employee Name :"+Ename);
    }
}
class Departments extends Employement
{
    String Dname;
    Departments(String dname)
    {
        this.Dname=dname;
    }
    void showEname(String Ename)
    {
        super.showEname(Ename);
        System.out.println("Department Name :"+Dname);
    }
}
class Companies extends Departments
{
    String cname;
    Companies(String dname,String Cname)
    {
        super(dname);
        this.cname=Cname;

    }
    void showCname()
    {
        System.out.println("Company Name: " + cname);
    }
}


public class MultiInheritence_Samevariablewithdatatype {

	public static void main(String[] args) {
		  Companies C=new Companies("Development","Gentech");
	        C.showEname("vasudev");
	        C.showCname();


	}

}
