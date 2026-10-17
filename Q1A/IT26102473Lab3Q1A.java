import java.util.Scanner;

public class  IT26102473Lab3Q1A {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		double priceof1kg;
 		double kilograms;
		double amount;
		
		
		System.out.print("Enter the price of 1kg rice:");
		priceof1kg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want:");
		kilograms = input.nextDouble();
		
		amount = priceof1kg * kilograms;
		
		System.out.println("The Total Amount:" + amount);
		
		input.close();
		
	}
	
}	
		