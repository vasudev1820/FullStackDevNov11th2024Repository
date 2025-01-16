package com.gentech.inheritanceexamples;

class Employeman
{
    void showEname(String Ename)
    {
        System.out.println("Employee Name :"+Ename);
    }
}
class Departments01 extends Employeman
{
    String ename;
    Departments01(String Ename)
    {
        this.ename=Ename;
    }
    void showEname(String Ename)
    {
        super.showEname(Ename);
        System.out.println("Department Name :"+ename);
    }
}

class Companies01 extends Employeman
{
    String cname;
    Companies01(String Cname)
    {
        this.cname=Cname;
    }
    void showCname(String Ename)
    {
        super.showEname(Ename);
        System.out.println("Company Name: " + cname);
    }
}



public class classContainSamemethodAndSignature {

	public static void main(String[] args) {
		Companies01 Com = new Companies01("Gentech academy and software solutions");
        Com.showCname("gowri");
        Departments01 Dept = new Departments01("Development");
        Dept.showEname("Vasudev");

	}

}
