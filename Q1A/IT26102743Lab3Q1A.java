import java.util.Scanner;

public class IT26102743Lab3Q1A {

  public static void main (String[] args){
  
  
      //VARIABLES
	  
        double priceperKg;
		double quantity;
		double totalAmount;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		 priceperKg = scanner.nextDouble();
		 
		System.out.print("Enter the number of kilograms you want to buy: "); 
		 quantity   =  scanner.nextDouble();
		 
		 totalAmount = priceperKg*quantity;
		
		System.out.println("Total amount to pay: " + totalAmount);
		
		scanner.close();
  
  
  
  
  
  
  
  
  
  }
  

}




