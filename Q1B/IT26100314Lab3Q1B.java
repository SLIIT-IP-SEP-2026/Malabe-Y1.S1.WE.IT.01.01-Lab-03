import java.util.Scanner;

public class IT26100314Lab3Q1B{
    public static void main(String[]args)   {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg");
		double priceOfKg = input.nextDouble();
		
		System.out.print("Enter the number of kg want to buy");
		 
		double numOfKg = input.nextDouble();
		
		System.out.print("Enter the discount");
		double discount = 0.1;
		
		double amount = priceOfKg * numOfKg;
		
		double disAmount = amount * discount;
		double totalAmount = amount - disAmount;
		
		
		System.out.println("The total is:" + totalAmount);
		
	           }
	 
		
}