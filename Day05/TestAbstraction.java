package oop;

abstract class Shape11
{  
	abstract void draw();  
}  
class Rectangle11 extends Shape11
{  
	void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
class Circle11 extends Shape11
{  
	void draw()
	{
		System.out.println("drawing circle");
	}  
}   
class TestAbstraction{  
	public static void main(String args[])
	{  
		Shape11 s = new Circle11();
		s.draw();  
	}  
}  