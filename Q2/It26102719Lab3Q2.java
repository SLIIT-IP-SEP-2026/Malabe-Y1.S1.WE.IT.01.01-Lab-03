import java.util.Scanner;

public class IT26102719Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter Number of OT Hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter OT Hourly Rate: ");
        double otRate = input.nextDouble();

        double otAmount = otHours * otRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount = " + otAmount);
        System.out.println("Total Salary = " + totalSalary);

        input.close();
    }
}
