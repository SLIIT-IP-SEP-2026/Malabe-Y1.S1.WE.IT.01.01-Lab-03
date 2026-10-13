import java.util.Scanner;
public class IT26102526Lab3Q1B {
	public static void main(String [] args) {
	
	double pricePerKg, quantity, totalAmount, discount;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice: ");
	pricePerKg = input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want to buy: ");
	quantity = input.nextDouble();
	
	discount = (pricePerKg * quantity) * (10.0 / 100);
	totalAmount = pricePerKg * quantity - discount;

	System.out.println();
	System.out.println("The total amount with 10% discount is: " + totalAmount);
			
	}
	
}
	