import java.util.Scanner;

public class  IT26102473Lab3Q1B {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		double priceof1kg;
 		double kilograms;
		double amount;
		double amountwithdiscount;
		double finalamount;
		
		System.out.print("Enter the price of 1kg rice:");
		priceof1kg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want:");
		kilograms = input.nextDouble();
		
		amount = priceof1kg * kilograms;
	
		amountwithdiscount = amount * 0.1;
		
		finalamount = amount - amountwithdiscount;
		
		System.out.println("The Total Amount with 10% discount is:" + finalamount);
		
		input.close();
		
	}
	
}	
		