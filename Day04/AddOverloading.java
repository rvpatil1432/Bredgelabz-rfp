package oop;

public class AddOverloading {

	public int add(int a , int b){
		return (a + b);
	}
	public int add(int a , int b , int c){
		return (a + b + c) ;
	}
	public double add(double a , double b){
		return (a + b);
	}
	public static void main( String args[]){
		AddOverloading ob = new AddOverloading();
		System.out.println(ob.add(15,25));
		System.out.println(ob.add(15,25,35));
		System.out.println(ob.add(11.5 , 22.5));
	}
}