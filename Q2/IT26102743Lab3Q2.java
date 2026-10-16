import java.util.Scanner;

public class IT26102743Lab3Q2 {

    public static void main(String[] args) {

        // VARIABLES
        double monthlySalary;
        double otHours;
        double otHourlyRate;
        double otAmount;
        double totalSalary;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        monthlySalary = scanner.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        otHours = scanner.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        otHourlyRate = scanner.nextDouble();

        // Calculate OT amount
        otAmount = otHours * otHourlyRate;

        // Calculate total salary
        totalSalary = monthlySalary + otAmount;

        System.out.println();
        System.out.println("The total salary including OT is: " + totalSalary);

        scanner.close();
    }
}