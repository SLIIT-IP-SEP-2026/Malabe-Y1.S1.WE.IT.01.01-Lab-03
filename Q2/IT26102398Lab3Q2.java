import java.util.Scanner;
public class IT26102398Lab3Q2 {
    public static void main(String[] args) {
        // Entering values
        int salary, OT_Hours, OT_Rate, OT_Amount;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        salary = input.nextInt();
        System.out.print("Enter the number of OT hours: ");
        OT_Hours = input.nextInt();
        System.out.print("Enter the OT hourly rate: ");
        OT_Rate = input.nextInt();
        // Salary calculation
        OT_Amount = OT_Hours * OT_Rate;
        total = (salary + OT_Amount) * 1.0;
        System.out.print("\nThe total salary including OT is: " + total); 
    }
}