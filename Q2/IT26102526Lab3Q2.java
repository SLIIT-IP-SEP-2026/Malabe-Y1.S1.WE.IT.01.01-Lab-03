import java.util.Scanner;
public class IT26102526Lab3Q2 {
	public static void main(String [] args){
		
	double moSalary, otHours, otHourrate, totalSalary, otAmount;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the monthly salary: ");
	moSalary = input.nextDouble();
	
	System.out.print("Enter the number of OT hours: ");
	otHours = input.nextDouble();
	
	System.out.print("Enter the OT hourly rate: ");
	otHourrate = input.nextDouble();
	
	otAmount = otHours * otHourrate;
	totalSalary = moSalary + otAmount;
	
	System.out.println();
	System.out.println("The total salary including OT is: " + totalSalary);
	
	}

}
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
	