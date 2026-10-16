import java.util.Scanner ;   

public class IT26102593Lab3Q1A {

     

      public static void main(String [] args) {
	  
	  
	     
		   
		   
		  Scanner input = new Scanner(System.in);
		  
		  
		  System.out.print("enter the price of one 1kg of rice :");
		  double priceperkg = input.nextDouble();
		  
		  
		  System.out.print("enter the the number of kilograms you want to buy :");
		  double quantity =  input.nextDouble();
		  
		  
		  
		  
		  double totalAmount = priceperkg * quantity;
		  
		  
		  System.out.println();
		  System.out.println(" the total amount is " + totalAmount);
		  
		  
		  }

}