import java.util.Scanner;
      public class IT26102663Lab3Q4     {
		  public static void main(String[] args)  {
		  
		  int number;
		  int digit1;
		  int digit2;
		  int digit3;
		  int digit4;
		  int digit5;
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter the 5 digit number:");
		  number = input.nextInt();
		  
		  digit1 = number / 10000;
		  number = number % 10000;
		  digit2 = number / 1000;
		  number = number % 1000;
		  digit3 = number / 100;
		  number = number % 100;
		  digit4 = number / 10;
		  number = number % 10;
		  digit5 = number / 1;
		  number = number % 1;
		  
		  System.out.print(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
		  
		  }
		  
	  }