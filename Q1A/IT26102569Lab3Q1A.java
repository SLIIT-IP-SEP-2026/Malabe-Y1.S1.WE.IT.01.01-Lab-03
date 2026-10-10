import java.util.Scanner;

public class IT26102569Lab3Q1A {
	public static void main (String[] args) {
		
		// Declare the variables 
		double price;
		double kilogram;
		double total;
		
		Scanner input=new Scanner (System.in);
		
		System.out.print("enter the price of 1 kg of rice: ");
		price=input.nextDouble();
		
		System.out.print("enter the number of kilograms: ");
		kilogram=input.nextDouble();
		
		total=price * kilogram;
		
		System.out.println("total price:"+ total);
		
		input.close();
		
		
	}
}	