package decisionMakingStatementsExamples;
import java.util.Scanner;
public class MaxNumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number1>number2&&number1>number3)
        {
        	System.out.println(number1+ " is greater");
        }
        else if(number2>number1&&number2>number3)
        {
        	System.out.println(number2+ " is greater");
        }
        else
        {
        	System.out.println(number3+ " is greater");
        }


	}

}
