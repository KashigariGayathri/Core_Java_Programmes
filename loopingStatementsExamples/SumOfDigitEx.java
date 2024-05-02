package loopingStatementsExamples;
import java.util.Scanner;
public class SumOfDigitEx {

	public  int display(int no)
	{
		int rem=0;
		int sum=0;
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		num = sc.nextInt();
		SumOfDigitEx sod=new SumOfDigitEx();
		
		int num2=sod.display(num);
		System.out.println("The sum od digit number is : "+num2);
	}

}
