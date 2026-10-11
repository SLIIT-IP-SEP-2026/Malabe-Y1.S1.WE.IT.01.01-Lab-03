import java.util.Scanner;
public class IT26102398Lab3Q3 {
    public static void main (String[] args) {
        // Amoounts
        int Amount, Note;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Ruppe amount: ");
        Amount = input.nextInt();
        // 5000
        Note = Amount / 5000;
        System.out.print("\n5000 Notes - " + Note);
        Amount -= (Note * 5000);
        // 1000
        Note = Amount / 1000;
        System.out.print("\n1000 Notes - " + Note);
        Amount -= (Note * 1000);
        // 500
        Note = Amount / 500;
        System.out.print("\n500 Notes - " + Note);
        Amount -= (Note * 500);
        // 200
        Note = Amount / 200;
        System.out.print("\n200 Notes - " + Note);
        Amount -= (Note * 200);
        // 100
        Note = Amount / 100;
        System.out.print("\n100 Notes - " + Note);
        Amount -= (Note * 100);
        // 50
        Note = Amount / 50;
        System.out.print("\n50 Notes - " + Note);
        Amount -= (Note * 50);
        // 20
        Note = Amount / 20;
        System.out.print("\n20 Notes - " + Note);
        Amount -= (Note * 20);
        // 10
        Note = Amount / 10;
        System.out.print("\n10 Notes - " + Note);
        Amount -= (Note * 10);
        // 5
        Note = Amount / 5;
        System.out.print("\n5 Notes - " + Note);
        Amount -= (Note * 5);
        // 2
        Note = Amount / 2;
        System.out.print("\n2 Notes - " + Note);
        Amount -= (Note * 2);
        // 1
        Note = Amount / 1;
        System.out.print("\n1 Notes - " + Note);
        Amount -= (Note * 1);
    }
}