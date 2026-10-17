import java.util.Scanner;
 
 public class IT26102556LAB3Q2	{
  
  public static void main(String[]args)
  {
  Double   monthlysalary,othours,othourlyrate,salary1,salary2;
  Scanner Scan = new Scanner(System.in);
  System.out.println("Enter the monthly salary : ");
  monthlysalary = Scan.nextDouble();
  System.out.println("Enter the number of OT hours : ");
  othours = Scan.nextDouble();
  System.out.println("Enter the OT horly rate : ");
  othourlyrate = Scan.nextDouble();
  
  salary1 = othourlyrate*othours;
  salary2 = salary1+monthlysalary;
  
  System.out.print(" The total salary includeing OT is :"+salary2);
  }
  }