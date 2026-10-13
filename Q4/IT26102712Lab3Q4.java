import java.util.Scanner;
	public class IT26102712Lab3Q4{
	public static void main(String[] args){
		
		int $5digitNumber;
		int num1,num2,num3,num4,num5;
		int rem;
		Scanner input=new Scanner(System.in);
	
	System.out.print("Enter a 05 digit number: ");
	$5digitNumber=input.nextInt();
	
	num1=$5digitNumber/10000;
	rem=$5digitNumber%10000;
	num2 = rem/1000;
	rem = rem%1000;
	num3 = rem/100;
	rem = rem%100;
	num4 = rem/10;
	rem = rem%10;
	num5 = rem;
	
	System.out.print(num1+" "+num2+" "+num3+" "+num4+" "+num5);
	}
}