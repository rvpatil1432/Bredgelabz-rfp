package oop;


class FinalVariable{  
	   //Blank final variable
	   final int MAX_VALUE;
		 
	   FinalVariable(){
	      //It must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
		   FinalVariable obj=new  FinalVariable();  
	      obj.myMethod();  
	   }  
	}