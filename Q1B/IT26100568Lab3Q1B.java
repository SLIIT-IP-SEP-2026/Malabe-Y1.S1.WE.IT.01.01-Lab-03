import java.util.Scanner;

public class IT26100568Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price, total, discount, finalAmount;
        int kilograms;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = input.nextInt();

        total = price * kilograms;

        discount = total * 0.10;

        finalAmount = total - discount;

        System.out.println("\nThe total amount with 10% discount is: " + finalAmount);

        input.close();
    }
}