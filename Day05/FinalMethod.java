package oop;

class XYZ{  
	   final void demo(){
	      System.out.println("XYZ Class Method");
	   }  
	}  
		     
	class FinalMethod extends XYZ{  
	   void demo(){                //final method cannot be overridden
	      System.out.println("ABC Class Method");
	   }  
		     
	   public static void main(String args[]){  
		   FinalMethod obj= new FinalMethod();  
	      obj.demo();  
	   }  
	}
