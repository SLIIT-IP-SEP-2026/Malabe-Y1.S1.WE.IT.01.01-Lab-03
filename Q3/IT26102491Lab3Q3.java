import java.util.Scanner;

public class IT26102491Lab3Q3 {
	public static void main (String[]arg) {
		
		int n5000,n1000,n500,n200,n100,n50,n20,c10,c5,c2,c1;
		int amount;
		
		Scanner input=new Scanner(System.in);
		System.out.print("amount:");
		amount=input.nextInt();
		
		n5000=amount/5000;
		amount%=5000;
		
		n1000=amount/1000;
		amount%=1000;
		
		n500=amount/500;
		amount%=500;
		
		n200=amount/200;
		amount%=200;
		
		n100=amount/100;
		amount%=100;
		
		n50=amount/50;
		amount%=50;
		
		n20=amount/20;
		amount%=20;
		
		c10=amount/10;
		amount%=10;
		
		c5=amount/5;
		amount%=5;
		
		c2=amount/2;
		amount%=2;
		
		c1=amount/1;
		amount%=1;
		
		System.out.println();
		System.out.println("5000 Notes-" + n5000);
	    System.out.println("1000 Notes-" + n1000);
        System.out.println("500 Notes-" + n500);
		System.out.println("200 Notes-" + n200);
		System.out.println("100 Notes-" + n100);
		System.out.println("50 Notes-" + n50);
		System.out.println("20 Notes-" + n20);
		System.out.println("10 Coins-" + c10);
		System.out.println("5 Coins-" + c5);
		System.out.println("2 Coins-" + c2);
		System.out.println("1 Coins-" + c1);
		
		
		
	}
}	
		
		
	