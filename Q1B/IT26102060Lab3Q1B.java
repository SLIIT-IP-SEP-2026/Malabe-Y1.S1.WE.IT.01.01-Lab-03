import java.util.Scanner;

	public class IT26102060Lab3Q1B{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter the price of 1 kg of rice: ");
		double priceOf1Kg = input.nextDouble();
		
		
		System.out.println ("Enter the number of kilograms you want to buy: ");
		double numberOfKg = input.nextDouble();
		
		double totalAmount = ((priceOf1Kg * numberOfKg) * 0.1);
		
		System.out.println ("The total amount with 10% discount: " + totalAmount);
		
		
		
		
		
	}
		
		
		
		
	}