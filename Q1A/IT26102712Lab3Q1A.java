import java.util.Scanner;
public class IT26102712Lab3Q1A{
	public static void main(String[] args){
		double priceOf1kg;
		double numOfkg;
		double totalPrice;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Price of 1kg:");
		priceOf1kg=input.nextDouble();
		System.out.print("Enter Number of kgs:");
		numOfkg=input.nextDouble();
		
		totalPrice=numOfkg*priceOf1kg;
		
		System.out.print("Total Price =" +totalPrice);
	}
}