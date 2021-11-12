package oop;

public class CallByReference 
{
	int a = 10;
	void call(CallByReference obj) 
	{
		obj.a = obj.a+10;
	}
	public static void main(String[] args) 
	{
		CallByReference obj = new CallByReference();
		System.out.println("Before call-by-reference: " + obj.a);
		obj.call(obj);
		System.out.println("After call-by-reference: " + obj.a);   
	}
}