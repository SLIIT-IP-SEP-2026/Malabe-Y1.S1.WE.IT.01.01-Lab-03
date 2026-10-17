import java.util.Scanner;

public class IT26102556LAB3Q1b{

public static void main(String[]args)
{
double  priceperKg,numberofKg,totalamount,Discountvalue,finalamount;
Scanner input = new Scanner(System.in);
System.out.println("Enter the price of 1Kg of rice:");
priceperKg = input.nextDouble();
System.out.println("Enter the numberof Kg you want to buy:");
numberofKg = input.nextDouble();


totalamount = priceperKg*numberofKg;
Discountvalue = totalamount*0.1;
finalamount = totalamount-Discountvalue;

System.out.print("The total amount with 10% is :"+ finalamount); 
}
}


