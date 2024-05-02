package loopingStatementsExamples;
import java.util.Scanner;
public class FactorialUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for factorial: ");
		int num = sc.nextInt();
		int product=1;
		for(int i=1;i<=num;i++) 
		{
			product=product*i;
			
		}
		System.out.println("Factorial of " +num+ "is : "+product );
		System.out.println("Using Decrement");
		int product2=1;
		for(int i=num;i>=1;i--) 
		{
			product2=product2*i;
		}
		System.out.println("Factorial of " +num+ "is : "+product2 );

	}

}
