package operators;

import java.util.Scanner;

public class LogicalOperatorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of number1,number2 and number3:");
		number1=sc.nextInt();
		number2=sc.nextInt();
		number3=sc.nextInt();
		boolean result;
		// Logical OR Operator
		result = (number1 > number2) || (number3 > number1);
		// result will be true because number3 greater than number1
		System.out.println(result);
		// Logical AND Operator
		result = (number1 > number2) && (number3 > number1);
		// result will be false because number1 is equal to number2
		System.out.println(result);
		
	}

}
