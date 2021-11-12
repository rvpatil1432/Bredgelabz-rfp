package oop;

 class ParentOverriding {
	void view(){
		System.out.println("this is a parent class method");
	}}
class Child extends ParentOverriding{
	void view(){
		System.out.println("this is a child class method");
	}}
public class Overriding{
public static void main(String args[]){
	ParentOverriding ob = new ParentOverriding();
ob.view();
ParentOverriding ob1 = new Child();
ob1.view();
}}