import java.util.Scanner;

public class IT26102655LAB3Q4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the five-digit Number
        System.out.print("Enter a five-digit Number: ");
        int Number = scanner.nextInt();

        // Extract each digit using arithmetic operators
        int d1 = Number / 10000;          // First digit
        int d2 = (Number / 1000) % 10;    // Second digit
        int d3 = (Number / 100) % 10;     // Third digit
        int d4 = (Number / 10) % 10;      // Fourth digit
        int d5 = Number % 10;             // Fifth digit

        // Display the digits separated by spaces
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);

        scanner.close();
    }
}