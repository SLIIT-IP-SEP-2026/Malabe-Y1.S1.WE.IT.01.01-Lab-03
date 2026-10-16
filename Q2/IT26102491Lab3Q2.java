import java.util.Scanner;

public class IT26102491Lab3Q2 {

	public static void main (String[] arg){
		int monthlySalary;
		int otHours;
		int otHourlyRate;
		int totalSalary;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:");
		monthlySalary=input.nextInt();
		
		System.out.print("Enter the  number of OT hours:");
		otHours=input.nextInt();
		
		System.out.print("Enter the OT hourly rate:");
		otHourlyRate=input.nextInt();
		
	    totalSalary=monthlySalary+(otHours*otHourlyRate);
		
		
		
		System.out.println();
		System.out.println("The total salary including OT is:" +totalSalary);
		
	}
}
