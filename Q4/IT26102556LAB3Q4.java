
import java.util.Scanner;

public class IT26102556LAB3Q4{
public static void main (String[]args)
{
Scanner scan = new Scanner(System.in);

int number ;
int d1,d2,d3,d4,d5;

System.out.println("Enter the rupee amount : ");
number = scan.nextInt();

d1 = number/10000;
number = number%10000;

d2 = number/1000;
number = number%1000;

d3 = number/100;
number = number%100;

d4 = number/10;
number = number%10;

d5 = number/1;
number = number%1;


System.out.print(d1+"  "+ d2+"  "+ d3+"  "+ d4+"  "+ d5+"  ");

}
}
  