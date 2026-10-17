import java.util.Scanner;
 
 public class IT26100314Lab3Q2{
	 public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:");
		double mSalary = input.nextDouble();
		
		
		System.out.print("Enter the number of OT hours:");
		double OtHours = input.nextDouble();
		
		System.out.print("Enter the OT rate:");
		double OtRate  = input.nextDouble();
		
		double otAmount = OtHours * OtRate ;
		double totalSalary = mSalary + otAmount ;
		
		
		
		System.out.println("The total salary with OT is :" + totalSalary);
		
	}
 }