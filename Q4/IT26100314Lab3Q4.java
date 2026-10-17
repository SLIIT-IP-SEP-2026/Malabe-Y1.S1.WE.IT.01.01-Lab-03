import java.util.Scanner;

public class IT26100314Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();

        int digit5 = number % 10;
        number = number / 10;

        int digit4 = number % 10;
        number = number / 10;

        int digit3 = number % 10;
        number = number / 10;

        int digit2 = number % 10;
        number = number / 10;

        int digit1 = number;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}