import java.util.Scanner;

public class IT26102199Lab3Q1A {
	public static void main (String[] args) {
		double pricePerKg;
		double howManyKg;
		double amount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of 1Kg of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		howManyKg = input.nextDouble();
		
		amount = (pricePerKg * howManyKg);
		
		System.out.print("The tatal amount is: " + amount);
		
	}
	
}