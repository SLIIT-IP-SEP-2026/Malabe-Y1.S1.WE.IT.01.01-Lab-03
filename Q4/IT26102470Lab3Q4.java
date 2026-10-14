import java.util.Scanner;
 public class IT26102470Lab3Q4 {
   public static void main(String[] args) {

    //Declare the variables
    int number;
    int d1,d2,d3,d4,d5;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a five-digit number: ");
    number = input.nextInt();

    d1 = number / 10000;
    number = number % 10000;

    d2 = number / 1000;
    number = number % 1000;

    d3 = number / 100;
    number =number % 100;

    d4 = number /10;
    d5 = number % 10;

    System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);

   }	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }