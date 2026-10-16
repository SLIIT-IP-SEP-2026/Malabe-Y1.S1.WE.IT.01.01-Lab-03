import java.util.Scanner;

	public class IT26102060Lab3Q2{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter the price monthly salary: ");
		double monthlySalary = input.nextDouble();
		
		System.out.println ("Enter the number of OT hours: ");
		double otHours = input.nextDouble();
		
		System.out.println ("Enter the OT hourly rate: ");
		double otHourlyRate = input.nextDouble();
		
		double otAmount = (otHours * otHourlyRate);
		double totalSalary = (monthlySalary + otAmount);
		
		System.out.println ("The total salary including OT is: " + totalSalary);
		
		
		
		
	}
	
	}