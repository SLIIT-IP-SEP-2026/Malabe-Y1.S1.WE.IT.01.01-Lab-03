import java.util.Scanner;

public class IT26102655LAB3Q2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		//Variables
		System.out.print("Enter the monthly salary : ");
		double monthlySalary = scanner.nextDouble();
		
		System.out.print("Enter the number of OT hours : ");
		double OTHours = scanner.nextDouble();
		
		System.out.print("Enter the OT hourly rate : ");
		double HourlyRate = scanner.nextDouble();
		
		//Calculation
		double OT = OTHours * HourlyRate;
		double TotalSalary = monthlySalary + OT;
		
		//Display
		System.out.println ("The Total Salary including OT is : " + TotalSalary);
		
	}
	
}