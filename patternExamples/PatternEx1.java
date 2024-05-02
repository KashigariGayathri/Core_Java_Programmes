package patternExamples;
import java.util.Scanner;
public class PatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int s=sc.nextInt();		
		for(int i=1;i<=s;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
