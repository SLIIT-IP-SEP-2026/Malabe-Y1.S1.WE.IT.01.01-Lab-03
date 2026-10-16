import java.util.Scanner;
     public class IT26102663Lab3Q3   {
		 public static void main(String[] args)   {
			 
			 int amount;
			 int C5000;
			 int C1000;
			 int C500;
			 int C200;
			 int C100;
			 int C50;
			 int C20;
			 int C10;
			 int C5;
			 int C2;
			 int C1;
			 
			 Scanner input = new Scanner(System.in);
			 
			 System.out.println("Enter the amount");
			 amount = input.nextInt();
			 
			 C5000 = amount / 5000;
			 amount = amount % 5000;
			 C1000 = amount / 1000;
			 amount = amount % 1000;
			 C500 = amount / 500;
			 amount = amount % 500;
			 C200 = amount / 200;
			 amount = amount % 200;
			 C100 = amount / 100;
			 amount = amount % 100;
			 C50 = amount / 50;
			 amount = amount % 50;
			 C20 = amount / 20;
			 amount = amount % 20;
			 C10 = amount / 10;
			 amount = amount % 10;
			 C5 = amount / 5;
			 amount = amount % 5;
			 C2 = amount / 2;
			 amount = amount % 2;
			 C1 = amount / 1;
			 amount = amount % 1;
			 
			 
			 System.out.println("5000 notes=" + C5000);
			 System.out.println("1000 notes=" + C1000);
			 System.out.println("500 notes=" + C500);
			 System.out.println("200 notes=" + C200);
			 System.out.println("100 notes=" + C100);
			 System.out.println("50 notes=" + C50);
			 System.out.println("20 notes=" + C20);
			 System.out.println("10 notes=" + C10);
			 System.out.println("5 notes=" + C5);
			 System.out.println("2 notes=" + C2);
			 System.out.println("1 notes=" + C1);
			 
		 }
	 }