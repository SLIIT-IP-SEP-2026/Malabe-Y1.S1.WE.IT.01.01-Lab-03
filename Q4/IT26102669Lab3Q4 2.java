import java.util.Scanner;

public class IT26102669Lab3Q4 {

    public static void main(String args[]) {

        //Declare the variables
        int number;
        int d1, d2, d3, d4, d5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        number = sc.nextInt();

        d1 = number / 10000;
        d2 = (number / 1000) % 10;
        d3 = (number / 100) % 10;
        d4 = (number / 10) % 10;
        d5 = number % 10;

        System.out.println();
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);

    }

}