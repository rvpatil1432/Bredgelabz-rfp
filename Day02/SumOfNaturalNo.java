import java.util.Scanner;

public class SumOfNaturalNo
{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number...");
		int num= sc.nextInt();

		int sum=0;
		int i=1;
				while(i <= num )
				{
					sum=sum+i;
					i=i+1;
				}
		System.out.println("sum of number"+sum);

	}
}
