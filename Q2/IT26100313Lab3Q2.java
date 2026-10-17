import java.util.Scanner;

public class IT26100313Lab3Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		double mSalary = input.nextDouble();
		
		System.out.print("Enter the the number of OT hours: ");
		double othNum = input.nextDouble();
		
		System.out.print("Enter the OT houry rate: ");
		double othRate = input.nextDouble();
		
		double otAmount = othNum * othRate;
		double tSalary = mSalary + otAmount;
		
		
		System.out.println("The total salary including OT is:" + tSalary);
	}
}