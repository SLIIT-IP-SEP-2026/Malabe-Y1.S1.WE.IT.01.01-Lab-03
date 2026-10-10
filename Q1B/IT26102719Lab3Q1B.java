import java.util.Scanner;

public class IT26102719Lab3Q1B {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms: ");
		double kilograms = input.nextDouble();
		double totalBill = pricePerKg * kilograms;
		double discount = totalBill * 0.10;
		double amountToPay = totalBill - discount;
		
		System.out.println("Discount = " + discount);
		System.out.println("Total Bill = " + totalBill);
		System.out.println("Amount to pay = " + amountToPay);
		
		input.close();
	}
}