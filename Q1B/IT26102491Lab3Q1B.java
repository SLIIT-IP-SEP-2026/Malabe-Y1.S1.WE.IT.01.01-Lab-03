import java.util.Scanner;

public class IT26102491Lab3Q1B {

	public static void main (String[] arg){
		double Priceofkg;
		double Numberofkg;
		double Amount;
		double Amountafterdiscount;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the price of kg:");
		Priceofkg=input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		Numberofkg=input.nextDouble();
		
		Amount=Priceofkg*Numberofkg;
		Amountafterdiscount=Amount-(Amount/10);
		
		System.out.println();
		System.out.println("The total amount with 10% discount is:" +Amountafterdiscount);
		
	}
}