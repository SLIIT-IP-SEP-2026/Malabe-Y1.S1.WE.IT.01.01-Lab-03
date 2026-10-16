import java.util.Scanner;

public class IT26102491Lab3Q4 {
	public static void main (String[] arg){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the five-digit number:");
		int number=input.nextInt();
		
		int digit1= number/10000;
		int digit2=(number/1000) % 10;
		int digit3=(number/100) % 10;
		int digit4=(number/10) % 10;
		int digit5=(number) % 10;
		
		System.out.println();
		System.out.println(digit1+" "+digit2+" "+digit3+" "+digit4+" "+digit5);
		
	}
}