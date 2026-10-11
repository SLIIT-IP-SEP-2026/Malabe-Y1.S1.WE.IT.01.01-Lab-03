import java.util.Scanner;
public class IT26102398Lab3Q1B {
    public static void main (String[] args) {
        // Entering numbers
        int rice, kg;
        double amount;
        Scanner input = new Scanner(System.in);
        // Price of Rice
        System.out.print("Enter the price of 1kg: ");
        rice = input.nextInt();
        // No. of kgs
        System.out.print("Enter the number of kilograms you want to buy: ");
        kg = input.nextInt();
        // Calculation
        amount = (rice * kg) * 1.0;
        System.out.print("\nThe total amount with 10% discount is: " + (amount - (amount * 0.1)));
    }
}