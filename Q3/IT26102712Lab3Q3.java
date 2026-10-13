import java.util.Scanner;
public class IT26102712Lab3Q3{
	public static void main(String[] args){
		int rupeeAmount;
		int $5000notes,$1000notes,$500notes,$200notes,$100notes,$50notes,$20notes,$10notes,$05notes,$02notes,$01notes;
		int remainder;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the rupee amount: ");
	rupeeAmount=input.nextInt();
		$5000notes=rupeeAmount/5000;
		remainder=rupeeAmount%5000;
		$1000notes=remainder/1000;
		remainder=remainder%1000;
		$500notes=remainder/500;
		remainder=remainder%500;
		$200notes=remainder/200;
		remainder=remainder%200;
		$100notes=remainder/100;
		remainder=remainder%100;
		$50notes=remainder/50;
		remainder=remainder%50;
		$20notes=remainder/20;
		remainder=remainder%20;
		$10notes=remainder/10;
		remainder=remainder%10;
		$05notes=remainder/5;
		remainder=remainder%5;
		$02notes=remainder/2;
		remainder=remainder%2;
		$01notes=remainder;
System.out.println("5000 Notes = " + $5000notes);
System.out.println("1000 Notes = " + $1000notes);
System.out.println("500 Notes = " + $500notes);
System.out.println("200 Notes = " + $200notes);
System.out.println("100 Notes = " + $100notes);
System.out.println("50 Notes = " + $50notes);
System.out.println("20 Notes = " + $20notes);
System.out.println("10 Notes = " + $10notes);
System.out.println("05 Notes = " + $05notes);
System.out.println("02 Notes = " + $02notes);
System.out.print("01 Notes = " + remainder);
		
	}
}