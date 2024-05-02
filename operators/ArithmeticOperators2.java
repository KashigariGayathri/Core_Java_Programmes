package operators;

import java.util.Scanner;

public class ArithmeticOperators2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Adition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Adition: "+(a%b));
		

	}

}
