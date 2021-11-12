import java.util.Scanner;

public class PalindromeFor {
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number...");
			int num= sc.nextInt();
		    int reversedNum = 0, remainder;
		    int originalNum = num;
		    for (;num != 0;num /= 10) {
		      remainder = num % 10;
		      reversedNum = reversedNum * 10 + remainder;
		    }
		    if (originalNum == reversedNum) {
		      System.out.println(originalNum + " is Palindrome.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome.");
		    }
		  }
}
