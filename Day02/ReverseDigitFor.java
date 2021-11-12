import java.util.Scanner;

public class ReverseDigitFor {
	public static void main(String[] args)
    {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number...");
		int num= sc.nextInt();
        int rev_num = 0;
        for (;num > 0;num = num / 10) {
            rev_num = rev_num * 10 + num % 10;     
        }
         ;
        System.out.println("Reverse of no. is "
                           + rev_num);
    }
}
