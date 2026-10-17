import java.util.Scanner;

public class IT26102556LAB3Q3{
public static void main (String[]args)
{
Scanner scan = new Scanner(System.in);

int number ;
int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;

System.out.println("Enter the rupee amount : ");
number = scan.nextInt();

d1 = number/5000;
number = number%5000;

d2 = number/1000;
number = number%1000;

d3 = number/500;
number = number%500;

d4 = number/100;
number = number%100;

d5 = number/50;
number = number%50;

d6 = number/20;
number = number%20;

d7 = number/5;
number = number%5;

d8 = number/2;
number = number%2;

d9 = number/1;
number = number%1;

d10 = number/1;
number = number%1;

System.out.println("5000 notes - "+d1);
System.out.println("1000 notes - "+d2);
System.out.println("500  notes - "+d3);
System.out.println("100  notes - "+d4);
System.out.println("50   notes - "+d5);
System.out.println("20   notes - "+d6);
System.out.println("5    coins - "+d7);
System.out.println("2    coins - " +d8);
System.out.println("1    coins - "+d9);
System.out.println("0    coins - "+d10);

}
}
  