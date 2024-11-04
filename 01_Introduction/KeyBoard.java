import java.util.Scanner;
import java.lang.*;

public class KeyBoard{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter two numbers : ");

		a = sc.nextInt();
		b = sc.nextInt();

		c = a + b;

		System.out.println("Sum = " + c);

	}
}
