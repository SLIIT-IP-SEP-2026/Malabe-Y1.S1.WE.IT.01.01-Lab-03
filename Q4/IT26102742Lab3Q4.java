import java.util.Scanner;
public class IT26102742Lab3Q4{
	public static void main(String[] args){
		String digit;
		char digit1,digit2,digit3,digit4,digit5;
		int i=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a five-digit number: ");		
		digit = scan.next();
		digit1 = digit.charAt(0);
        digit2 = digit.charAt(1);
		digit3 = digit.charAt(2);
		digit4 = digit.charAt(3);
		digit5 = digit.charAt(4);
		System.out.print(digit1+" "+digit2+" "+digit3+" "+digit4+" "+digit5);
	}
}