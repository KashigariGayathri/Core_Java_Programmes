package loopingStatementsExamples;
import java.util.Scanner;
public class PalindromeNumberEx {
	public long display(long no)
	{
		 long rev=0;
	        while(no!=0) {
	            long n=no%10;
	            rev=(rev*10)+n;
	            no=no/10;
	}
	        return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		num = sc.nextInt();
		ReverseNumberEx revNum = new ReverseNumberEx();
		
		long num2=revNum.display(num);
		if(num==num2)
		{
			System.out.println("The number is palindrome number");
		}
		else
		{
			System.out.println("The number is not a palindrome number");
		}
	}

}
