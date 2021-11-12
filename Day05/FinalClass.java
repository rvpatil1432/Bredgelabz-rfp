package oop;

public class FinalClass {

}
final class ParentClass 
{
    void showData() 
    {
        System.out.println("This is a method of final Parent class");
    }
}
//It will throw compilation error
class ChildClass extends ParentClass 
{
    void showData() 
    {
        System.out.println("This is a method of Child class");
    }
}
class MainClass
{
    public static void main(String arg[])
    {
    	ChildClass obj = new ChildClass();
        obj.showData();
    }
}