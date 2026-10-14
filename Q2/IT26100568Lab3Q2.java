import java.util.Scanner;

public class IT26100568Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double monthlySalary,otHours,otHourlyRate,otAmount,totalSalary;
        

        System.out.print("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        otHours = input.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        otHourlyRate = input.nextDouble();

        otAmount = otHours * otHourlyRate;

        totalSalary = monthlySalary + otAmount;

        System.out.println();
        System.out.println("The total salary with OT: " + totalSalary);

        input.close();
    }
}