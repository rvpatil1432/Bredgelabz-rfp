package oop;

abstract class Shape
{  
	abstract void draw();  
}  
class Rectangle extends Shape
{  
	void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape
{  
	void draw(){System.out.println("drawing circle");}  
}  
class ShapeAbstraction
{  
	public static void main(String args[])
	{  
		Shape s1=new Circle1();
		Shape s2=new Rectangle();
		s1.draw();  
		s2.draw();  
	}  
}  