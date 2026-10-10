import java.util.Scanner;

public class IT26102569Lab3Q2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double monthlySalary, otHours, otHourlyRate;
		double otAmount, totalSalary;

		System.out.print("Enter Monthly Salary: ");
		monthlySalary = input.nextDouble();

		System.out.print("Enter OT Hours: ");
		otHours = input.nextDouble();

		System.out.print("Enter OT Hourly Rate: ");
		otHourlyRate = input.nextDouble();

		otAmount = otHours * otHourlyRate;
		totalSalary = monthlySalary + otAmount;

		System.out.println("OT Amount: " + otAmount);
		System.out.println("Total Salary: " + totalSalary);

		input.close();
		
	}
}