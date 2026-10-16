import java.util.Scanner;
     public class IT26102663Lab3Q1B    {
		 public static void main(String[] args)   {
			 
		double priceOf1Kg;
		int noOfKgs;
		double amount;
		double discount;
		double finalPayment;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice");
		priceOf1Kg = input.nextDouble();
		
		System.out.println("Enter the no of kgs of rice you need");
		noOfKgs = input.nextInt();
		
		amount = priceOf1Kg * noOfKgs;
		
		discount = amount * 0.1;
		
		finalPayment = amount - discount;
		
		System.out.print("The amount we have to pay="  + finalPayment);
		
		 }
		 
	 }