package loopingStatementsExamples;
import java.util.Scanner;
public class FactorialUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for factorial: ");
		int num = sc.nextInt();
		int product=1;
		int fact = 1;
        int i = 1;
       do
        {
            fact = fact * i;
            i++;
        } while(i<=num);
		System.out.println("Factorial of " +num+ "is : "+fact );
		System.out.println("Using Decrement");
		int product2=1;
		int fact2 = 1;
		int j = num;
		do
		{
		fact2 = fact2 *j;
		j--;
		}while(j>=1);
		System.out.println("Factorial of " +num+ "is : "+fact2 );


	}

}
