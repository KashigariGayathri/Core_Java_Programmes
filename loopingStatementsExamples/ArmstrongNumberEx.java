package loopingStatementsExamples;
import java.math.*;
import java.util.Scanner;
public class ArmstrongNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int num1=num;
		int rem, sum=0;
		while(num1!=0)
		{
			rem=num1%10;
			System.out.println("rem : "+rem);
			sum +=Math.pow(rem, 3);
			num1=num1/10;
		}
		System.out.println("the sum is " +sum);
		if(num==sum)
		{
			System.out.println("The number is Armstrong number ");
		}
		else
		{
			System.out.println("The number is not a Armstrong number ");
		}

	}

}
