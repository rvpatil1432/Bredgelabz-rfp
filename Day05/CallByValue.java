package oop;

public class CallByValue
{    
    int a = 10;
    void call(int a) 
    {
        a = a+10;
    }
     
    public static void main(String[] args) 
    {
    	CallByValue eg = new CallByValue();
        System.out.println("Before call-by-value: " + eg.a);
        eg.call(50510);
        System.out.println("After call-by-value: " + eg.a);
    }
}