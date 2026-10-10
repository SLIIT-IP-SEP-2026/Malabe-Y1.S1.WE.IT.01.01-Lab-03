import java.util.Scanner;

public class IT26102569Lab3Q1B {
	public static void main (String[] args) {
		
		// Declare the variables 
		double price;
		double kilogram;
		double total;
		double amountwithdiscount;
		double finalamount;
		
		Scanner input=new Scanner (System.in);
		
		System.out.print("enter the price of 1 kg of rice: ");
		price=input.nextDouble();
		
		System.out.print("enter the number of kilograms: ");
		kilogram=input.nextDouble();
		
		total=price * kilogram;
		
		amountwithdiscount=total * 0.1;
		
		finalamount=total-amountwithdiscount;
		
		System.out.println("The total with 10% discount is;" + finalamount);
		
		input.close();
		
		
	}
}	