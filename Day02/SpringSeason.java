import java.util.Scanner;

public class SpringSeason 
{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter month...");
		int m= sc.nextInt();
		System.out.println("Enter date...");
		int d= sc.nextInt();*/
		int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
		if((m>=3 && d>=20) && (m<=6 && d<=20)) 
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
