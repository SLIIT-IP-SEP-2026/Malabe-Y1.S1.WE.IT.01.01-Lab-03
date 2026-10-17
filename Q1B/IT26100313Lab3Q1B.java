import java.util.Scanner;

public class IT26100313Lab3Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double PriceOFkg = input.nextDouble();
		
		System.out.print("Enter the number of kilos you want to buy:");
		double NumOfkg = input.nextDouble();
		
		double Amount = PriceOFkg * NumOfkg;
		
        double discount = 0.1;
		
		double Tamount = Amount - (Amount*discount);
		
		System.out.print("The total amount is:"+ Tamount);
		
	}
} 