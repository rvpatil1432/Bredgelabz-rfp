package oop;

class AnimalWorld{  
	void eat(){System.out.println("eating...");}  
}  
class Tiger extends AnimalWorld{  
	void bark(){System.out.println("roaring...");}  
}  
class BabyTiger extends Tiger{  
	void weep(){System.out.println("weeping...");}  
}  
class TestMultilevelInheritance{  
	public static void main(String args[]){  
		BabyTiger d=new BabyTiger();  
		d.weep();  
		d.bark();  
		d.eat();  
	}}  