package loopingStatementsExamples;
import java.util.Scanner;
public class SumOfEvenNumbersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want even numbers sum: ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) 
		{
			if(i%2==0) {
				sum=sum+i;
			
			}
		}
		System.out.println("number : "+sum);
		int j=1;
		int sum2=0;
		while(j<=num)
		{
			if(j%2==0)
			{
				sum2=sum2+j;
			}
			j++;
		}
		System.out.println("number1 : "+sum2);
		int k=1;
		int sum3=0;
		do
		{
			if(k%2==0) {
				sum3=sum3+k;
			}
			k++;
		}while(k<=num);
		System.out.println("number2 : "+sum3);
	}

}
