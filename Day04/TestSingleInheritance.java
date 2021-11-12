package oop;


class InheritAnimal{  
void eat(){System.out.println("eating...");}  
}  
class Cat extends InheritAnimal{  
void bark(){System.out.println("meow...");}  
}  
class TestSingleInheritance{  
public static void main(String args[]){  
	Cat c=new Cat();  
c.bark();  
c.eat();  
}}  