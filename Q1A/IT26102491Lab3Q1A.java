import java.util.Scanner;

public class IT26102491Lab3Q1A {
	public static void main (String[] arg){
		double Priceofkg;
		double Numberofkg;
		double Amount;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the price of kg:");
		Priceofkg=input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		Numberofkg=input.nextDouble();
		
		Amount=Priceofkg*Numberofkg;
		
		System.out.println();
		System.out.println("The amount is:" +Amount);
		
	}
}