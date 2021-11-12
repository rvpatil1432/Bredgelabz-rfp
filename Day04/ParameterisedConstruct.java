package oop;

public class ParameterisedConstruct 
{
	int id;  
	String name;  
	ParameterisedConstruct(int i,String n)
	{  
		id = i;  
		name = n;  
	}  
	void display()
	{
		System.out.println(id+" "+name);
	}  

	public static void main(String args[])
	{  
		ParameterisedConstruct p1 = new ParameterisedConstruct(001,"Rohini");  
		ParameterisedConstruct p2 = new ParameterisedConstruct(002,"Vishal");    
		p1.display();  
		p2.display();  
	}  
}  