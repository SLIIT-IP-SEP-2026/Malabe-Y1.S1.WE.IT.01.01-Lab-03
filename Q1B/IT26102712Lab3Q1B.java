import java.util.Scanner;
public class IT26102712Lab3Q1B{
	public static void main(String[] args){
		double priceOf1kg;
		double numOfkgs;
		double discountPrice;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice :");
		priceOf1kg=input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy :");
		numOfkgs=input.nextDouble();
		
		discountPrice=(priceOf1kg*numOfkgs)*0.9;
		System.out.print("The total amount with 10% discount is:" + discountPrice);
	}
}