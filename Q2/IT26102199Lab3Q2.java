import java.util.Scanner;

public class IT26102199Lab3Q2 {
	public static void main (String[] args) {
		
		double OTamount, TotSalary, OThours, OTrate, mSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		mSalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		OThours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		OTrate = input.nextDouble();
		
		OTamount = OThours * OTrate;
		
		TotSalary = mSalary + OTamount;
		
		System.out.print("The total salary including OT is: " + TotSalary);
		
	}
	
}