package operators;

import java.util.Scanner;

public class RealtionalOperatorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of number1 and number2 :");
		number1=sc.nextInt();
		number2=sc.nextInt();
		if (number1 > number2)
		{
		System.out.println("number1 is greater than number2.");
		}
		if (number1 < number2)
		{
		System.out.println("number2 is greater than number1.");
		}
		if (number1 == number2)
		{
		System.out.println("number1 is equal to number2.");
		}

	}

}
