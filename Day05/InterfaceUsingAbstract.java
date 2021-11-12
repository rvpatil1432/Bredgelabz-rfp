package oop;

interface Inter
{
	void methodOne();
}
abstract class Abstr implements Inter
{
	void methodTwo() 
	{
		System.out.println("methodTwo called..");
	}
}
class Test extends Abstr
{
	public void methodOne() 
	{
		System.out.println("methodOne called..");
	}
	void methodThree() 
	{
		System.out.println("methodThree called..");
	}
}
public class InterfaceUsingAbstract
{
	public static void main(String args[]) 
	{
		Test t = new Test();
		t.methodOne();
		t.methodTwo();
		t.methodThree();
	}
}
