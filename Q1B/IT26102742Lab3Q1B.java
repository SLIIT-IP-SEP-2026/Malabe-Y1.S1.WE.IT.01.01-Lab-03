import java.util.Scanner;
public class IT26102742Lab3Q1B{
	public static void main(String[] args){
		double priceOf1kg, noOfkg,total;
		double discount = 0.9;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice : ");
		priceOf1kg = input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy : ");
		noOfkg = input.nextDouble();
		total = (priceOf1kg * noOfkg)*discount;
		System.out.print("The total amount with 10% discount is : "+total);
	}
}