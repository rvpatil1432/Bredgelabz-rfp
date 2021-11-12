import java.util.Scanner;

public class MinMaxOP
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a...");
		int a= sc.nextInt();
		System.out.println("Enter value of b...");
		int b= sc.nextInt();
		System.out.println("Enter value of c...");
		int c= sc.nextInt();
		int expr1 =  a+b*c;
		int expr2 = c+a/b;
		int expr3 = a%b+c;
		int expr4 = a*b+c;
		System.out.println("First Expression : "+expr1+"\nSecond Expression : "+expr2+"\nThird Expression : "+expr3+"\nFourth Expression : "+expr4);
		int arr[] = {expr1,expr2,expr3,expr4};
		int maxValue = arr[0]; 
		for(int i=1;i < arr.length;i++){ 
			if(arr[i] > maxValue){ 
				maxValue = arr[i]; 
			} 
		} 
		System.out.println("Maximum value is.."+maxValue);
		int minValue = arr[0]; 
		for(int i=1;i<arr.length;i++)
		{ 
			if(arr[i] < minValue)
			{ 
				minValue = arr[i]; 
			} 
		}
		System.out.println("Minimum value is.."+minValue);
	}
}
