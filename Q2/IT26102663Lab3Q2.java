import java.util.Scanner;
      public class IT26102663Lab3Q2   {
		  public static void main(String[] args)   {
			  
			  double monthlySalary;
			  int otHours;
			  double otHourlyRate;
			  double otAmount;
			  double totalSalary;
			  
			  Scanner input = new Scanner(System.in);
			  
			  System.out.println("Enter the no of OT hours");
			  otHours = input.nextInt();
			  
			  System.out.println("Enter the OT hourly rate");
			  otHourlyRate = input.nextDouble();
			  
			  otAmount = otHours * otHourlyRate;
			  
			  System.out.println("Enter the monthly salary");
			  monthlySalary = input.nextDouble();
			  
			  totalSalary = monthlySalary + otAmount;
			  
			  System.out.print("Total Salary is " + totalSalary);
			  
		  }
	  }