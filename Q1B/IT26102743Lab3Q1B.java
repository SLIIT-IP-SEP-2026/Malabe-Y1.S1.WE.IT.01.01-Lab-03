import java.util.Scanner;

public class IT26102743Lab3Q1B {

    public static void main(String[] args) {

        double priceperKg;
        double quantity;
        double totalAmount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        priceperKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = scanner.nextDouble();

        totalAmount = priceperKg * quantity;

        totalAmount = totalAmount * 0.90;

        System.out.println("The total amount with 10% discount is: " + totalAmount);

        scanner.close();
    }
}