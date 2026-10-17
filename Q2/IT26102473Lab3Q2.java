import java.util.Scanner;

public class  IT26102473Lab3Q2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		double monthlysalary;
 		double othours;
		double otamount;
		double othourlyrate;
		double totalsalary;
		
		System.out.print("Enter the monthly salary:");
		monthlysalary = input.nextDouble();
		
		System.out.print("Enter the number of OT Hourds:");
		othours = input.nextDouble();
		
		System.out.print("Enter the OT Hourly rate;");
		othourlyrate = input.nextDouble();
		
		otamount = othours * othourlyrate;
	
		totalsalary = monthlysalary + otamount;
		
		
		System.out.println("The Total salary:" + totalsalary);
		
		input.close();
		
	}
	
}	
		