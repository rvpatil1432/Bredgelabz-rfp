package com.bredgelabz.workshop;

class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	public SavingsAccount() {
		annualInterestRate = 0.0;
		savingsBalance = 0.0;
		
	}

	public SavingsAccount(double savBal) {
	//	annualInterestRate = intRate;
		savingsBalance = savBal;
	}

	public double calculateMonthlyInterest() {
		double intRate = (savingsBalance * annualInterestRate/12);
		savingsBalance = savingsBalance + intRate;
		return intRate;
	}

	public static void modifyInterestRate(double newInteresRate) {
		annualInterestRate = newInteresRate;
	}

	/*public void setSavingsBalance(double newBal) {
		savingsBalance = newBal;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}*/
}
public class SavingsAccountTest {
	public static void main(String[] args) {
		double monthInterest1;
		double monthInterest2;
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
	//	saver1.setSavingsBalance(2000.00);
	//	saver2.setSavingsBalance(3000.00);
		SavingsAccount.modifyInterestRate(0.04);
		monthInterest1 = saver1.calculateMonthlyInterest();
		monthInterest2 = saver2.calculateMonthlyInterest();
		System.out.printf("New Balance for Saver1="+monthInterest1);
		System.out.printf("\nNew Balance for Saver2="+monthInterest2);

		SavingsAccount.modifyInterestRate(0.05);
		monthInterest1 = saver1.calculateMonthlyInterest();
		monthInterest2 = saver2.calculateMonthlyInterest();
		System.out.printf("\nNew Balance for Saver1="+monthInterest1);
		System.out.printf("\nNew Balance for Saver2="+monthInterest2);

	}
}

