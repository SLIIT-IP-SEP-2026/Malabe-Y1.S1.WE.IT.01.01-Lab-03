import java.util.Scanner;

public class IT26102669Lab3Q1B {

    public static void main(String args[]) {
    
        //Declare the variables
        double pricePerKg,quantity,totalAmount,finalAmount;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = sc.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = sc.nextDouble();

        totalAmount = pricePerKg * quantity;
        finalAmount = totalAmount * 0.9;

        System.out.println();
        System.out.println("The total amount with 10% discount is: " + finalAmount);

    }

}