
import java.util.Scanner;

public class IT26102600LAB3Q1A {

    public static void main(String args[]) {

        double priceperkg, quantity, totalAmount;
        double discount, finalAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        priceperkg = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        quantity = input.nextDouble();

        totalAmount = priceperkg * quantity;

        discount = totalAmount * 0.10;

        finalAmount = totalAmount - discount;

        System.out.println();
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to pay: " + finalAmount);

        input.close();
    }
}
