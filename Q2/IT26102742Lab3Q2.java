import java.util.Scanner;
public class IT26102742Lab3Q2{
	public static void main(String[] args){
		double monthlySal,noOfOThrs,hourlyRate,OTamount,Tot;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the monthly salary: ");
		monthlySal = scan.nextDouble();
		System.out.print("Enter the number of OT hours: ");
		noOfOThrs = scan.nextDouble();
		System.out.print("Enter the OT hourly rate: ");
		hourlyRate = scan.nextDouble();
		OTamount = noOfOThrs*hourlyRate;
		Tot = monthlySal + OTamount;
		System.out.print("The total salary including OT is: "+ Tot);
	}
}