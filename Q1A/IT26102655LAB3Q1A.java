import java.util.Scanner;

public class IT26102655LAB3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input price per kg
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Input quantity in kg
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        // Calculate total
        double TotalAmount = pricePerKg * kilograms;

        // Display output
        System.out.println("The Total Amount is: " + TotalAmount);

        scanner.close();
    }
}