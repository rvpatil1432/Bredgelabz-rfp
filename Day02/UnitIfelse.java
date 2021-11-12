import java.util.Scanner;

public class UnitIfelse {
	public static void main(String args [])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1,10,100...");
		int unit= sc.nextInt();
		if(unit==1) {
			System.out.println("unit");
		}
		else if(unit==10) {
			System.out.println("ten");
		}
		else if(unit==100) {
			System.out.println("hundred");
		}
		else if(unit==1000) {
			System.out.println("thousand");
		}
		else if(unit==10000) {
			System.out.println("tern thousand");
		}
		else if(unit==100000) {
			System.out.println("lac");
		}
		else if(unit==1000000) {
			System.out.println("ten lac");
		}
		else if(unit==10000000) {
			System.out.println("Crore");
		}
		else
			System.out.println("Error Enter proper number..");

	}
}
