import java.util.Scanner;

public class IT26102669Lab3Q2 {

    public static void main(String args[]) {
    
        //Declare the variables
        double monthlySalary, otHours, otHourlyRate, otAmount, totalSalary;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        monthlySalary = sc.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        otHours = sc.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        otHourlyRate = sc.nextDouble();

        otAmount = otHours * otHourlyRate;
        totalSalary = monthlySalary + otAmount;

        System.out.println();
        System.out.println("The total salary including OT is: " + totalSalary);

    }

}