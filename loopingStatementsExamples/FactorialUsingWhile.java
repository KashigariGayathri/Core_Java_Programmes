package loopingStatementsExamples;

import java.util.Scanner;

public class FactorialUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for factorial: ");
		int num = sc.nextInt();
		int product=1;
		int fact = 1;
        int i = 1;
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
		System.out.println("Factorial of " +num+ "is : "+fact );
		System.out.println("Using Decrement");
		int product2=1;
		int fact2 = 1;
		int j = num;
		while(j>=1)
		{
		fact2 = fact2 *j;
		j--;
		}
		System.out.println("Factorial of " +num+ "is : "+fact2 );

	}

}
