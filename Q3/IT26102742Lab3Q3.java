import java.util.Scanner;
public class  IT26102742Lab3Q3{
	public static void main(String[] args){
		int amount, no5000,no1000,no500,no200,no100,no50,no20,no10,no5,no2,no1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Ruppe Amount: ");
		amount = scan.nextInt();
		no5000 = amount/5000;
		amount = amount%5000;
		no1000 = amount/1000;
		amount = amount%1000;
		no500 = amount/500;
		amount = amount%500;
		no200 = amount/200;
		amount = amount%200;
		no100 = amount/100;
		amount = amount%100;
		no50 = amount/50;
		amount = amount%50;
		no20 = amount/20;
		amount = amount%20;
		no10 = amount/10;
		amount = amount%10;
		no5 = amount/5;
		amount = amount%5;
		no2 = amount/2;
		amount = amount%2;
		System.out.println("5000 Notes - "+ no5000);
		System.out.println("1000 Notes - "+ no1000);
		System.out.println("500 Notes - "+ no500);
		System.out.println("200 Notes - "+ no200);
		System.out.println("100 Notes - "+ no100);
		System.out.println("50 Notes - "+ no50);
		System.out.println("20 Notes - "+ no20);
		System.out.println("10 Notes - "+ no10);
		System.out.println("05 Notes - "+ no5);
		System.out.println("02 Notes - "+ no2);
		System.out.println("01 Notes - "+ amount);
	}
}