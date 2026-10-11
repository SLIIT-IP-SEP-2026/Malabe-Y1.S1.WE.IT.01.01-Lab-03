import java.util.Scanner;
public class IT26102398Lab3Q4 {
    public static void main (String[] args) {
        // Numbers declaration
        int number, a, b, c, d, e;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five - digit number: ");
        number = input.nextInt();
        // a
        a = number / 10000;
        System.out.print(a);
        number -= (a * 10000);
        // b
        b = number / 1000;
        System.out.print(" " + b);
        number -= (b * 1000);
        // c
        c = number / 100;
        System.out.print(" " + c);
        number -= (c * 100);
        // d
        d = number / 10;
        System.out.print(" " + d);
        number -= (d * 10);
        // e
        e = number / 1;
        System.out.print(" " + e);
        number -= (e * 1);
    }
}