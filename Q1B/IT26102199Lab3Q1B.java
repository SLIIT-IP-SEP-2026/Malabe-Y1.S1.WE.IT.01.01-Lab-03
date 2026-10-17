import java.util.Scanner;

public class IT26102199Lab3Q1B {
	public static void main (String[] args) {
		double pricePerKg;
		double howManyKg;
		double amount;
		double afterDiscount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of 1Kg of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		howManyKg = input.nextDouble();
		
		amount = (pricePerKg * howManyKg);
		
		afterDiscount = amount - (amount / 10);
		
		System.out.print("The tatal amount is: " + afterDiscount);
		
	}
	
}