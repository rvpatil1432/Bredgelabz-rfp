

import java.util.Scanner;
public class Qudratic
{
	public static void main(String args[])
	{
		double secondRoot = 0, firstRoot = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b ::");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c ::");
		double c = sc.nextDouble();
		double determinant = (b*b)-(4*a*c);
		double sqrt = Math.sqrt(determinant);
		firstRoot = (-b + sqrt)/(2*a);
		secondRoot = (-b - sqrt)/(2*a);
		System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);

	}
}