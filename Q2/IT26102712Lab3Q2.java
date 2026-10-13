import java.util.Scanner;
public class IT26102712Lab3Q2{
	public static void main(String[] args){
		double monthlySalary;
		double numOfOtHours;
		double otHourlyRate;
		double otAmount;
		double totalSalary;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary=input.nextDouble();
		System.out.print("Enter the number of OT hours: ");
		numOfOtHours=input.nextDouble();
		System.out.print("Enter the OT hourly rate: ");
		otHourlyRate=input.nextDouble();
		
		otAmount=numOfOtHours*otHourlyRate;
		totalSalary=monthlySalary+otAmount;
		
		System.out.print("The total salary including OT is: " +totalSalary);
	}
}