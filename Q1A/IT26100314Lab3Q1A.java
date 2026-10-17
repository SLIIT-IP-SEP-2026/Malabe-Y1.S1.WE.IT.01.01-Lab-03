import java.util.Scanner;

public class IT26100314Lab3Q1A{
    public static void main(String[]args)   {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg");
		double priceOfKg = input.nextDouble();
		
		System.out.print("Enter the number of kg want to buy");
		 
		double numOfKg = input.nextDouble();
		
		double totalAmount = priceOfKg * numOfKg;
		
		
		System.out.println("The total is:" + totalAmount);
		
	           }
	 
		
}