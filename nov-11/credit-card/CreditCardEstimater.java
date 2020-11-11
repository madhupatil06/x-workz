package com.xworkz.basics;

public class CreditCardEstimater {
	private static double limit=1000;
	public static void expenditure(double amount)
	{
		System.out.println("Total amount in credit card is "+limit);
		if(amount<limit)
		{
			System.out.println("Total expenditure is "+amount);
			amount=limit-amount;
			System.out.println("Remaining amount is "+amount);
		}
		else
		{
			System.out.println("Expenditure must be less than limit");
		}
	}

}
