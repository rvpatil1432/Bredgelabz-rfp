package com.bredgelabz.workshop;

class Car
{
	private int speed;
	protected double regularPrice;
	private String color;

	public Car (int Speed,double regularPrice,String color) {
		this.speed = Speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	public double getSalePrice() {
		return regularPrice;
	}
	public String toString() {
		 return "Speed: "+speed+
		 "\nRegular price: $"+regularPrice+
		 "\nColor: "+color; 
		 }

}
class Truck extends Car
{
	int weight;
	public Truck (int weight,int speed,double regularPrice,String color)
	{
		super(speed,regularPrice,color);
		this.weight = weight;
		}
	public double getSalePrice()
	{
		if(weight>2000) {
			return (regularPrice*10)/100;//If weight>2000,10%discount. Otherwise, 20% discount.
		}
		else {
			return (regularPrice*20)/100;
		}
	}
	public String toString() {
		 return "Truck\n"+super.toString()+"\nWeight: "+weight; 
		 }
	}
class Ford extends Car
{
	int year;
	int manufacturerDiscount;
	public Ford(int year,int manufacturerDiscount,int speed,double regularPrice,String color) {
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	public double getSalePrice() {
		return super.getSalePrice()-(super.getSalePrice()*((double)manufacturerDiscount/100.0));
	}
	//From the sale price computed from Car class,subtract the manufacturer Discount.
	public String toString() {
		 return "Ford\n"+super.toString()+"\nYear: "+year+"\nManufacturer discount: "+manufacturerDiscount+"%"; 
		 }
}
class Sedan extends Car
{
	int length;
	public Sedan(int length,int speed,double regularPrice,String color) {
		super(speed,regularPrice,color);
		this.length=length;
	}
	public double getSalePrice() {
		 double salePrice=super.getSalePrice();
		 if(length<20) {
		 return salePrice-salePrice*0.05;
		 }
		 return salePrice-salePrice*0.1;
		 }
	//If length>20 feet, 5% discount, Otherwise, 10% discount.	
	public String toString() {
		 return "Sedan\n"+super.toString()+"\nLength: "+length+ " feet"; 
		 }
}
public class MyOwnAutoShop {
	public static void main(String[] args) {
		Car car =new Car(250, 35000, "Blue");
		Truck truck=new Truck(12,250, 60000, "Black");
		Ford ford =new Ford(2000,10,180, 55000, "Yellow");
		Sedan sedan =new Sedan(235,180, 55000, "Green");
		System.out.println(truck.toString());
		 System.out.println("The sale price: $"+truck.getSalePrice()+"\n\n");
		 System.out.println(ford.toString());
		 System.out.println("The sale price: $"+ford.getSalePrice()+"\n\n");
		 System.out.println(sedan.toString());
		 System.out.println("The sale price: $"+sedan.getSalePrice()+"\n\n");
		 System.out.println("Car\n"+car.toString());
		 System.out.println("The sale price: $"+car.getSalePrice()+"\n\n");
	}
}
