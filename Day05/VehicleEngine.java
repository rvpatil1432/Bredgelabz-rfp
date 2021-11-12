package oop;


interface Vehicle {
	public void start();
    public void stop();
    default void blowHorn(){
      System.out.println("Blowing horn");
   }
}
 

class Honda implements Vehicle 
{
	public void start() {
        System.out.println("starting engine...");
    }
    public void stop() {
        System.out.println("stopping engine...");
    }
}
 
class VehicleEngine
{
    public static void main(String[] args)
    {
    	Honda honda = new Honda();      
    	honda.start();
    	honda.stop();
    	honda.blowHorn();
    }
}