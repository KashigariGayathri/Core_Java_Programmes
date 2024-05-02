package loopingStatementsExamples;
import java.util.Scanner;
public class EvenNumbersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want even numbers : ");
		int num = sc.nextInt();
		for(int i=0;i<=num;i++) 
		{
			if(i%2==0) {
			System.out.println("number : "+i);
			}
		}
		

	}

}
