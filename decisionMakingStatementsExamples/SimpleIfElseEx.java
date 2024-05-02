package decisionMakingStatementsExamples;
import java.util.Scanner;
public class SimpleIfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :");
     int num=sc.nextInt();
     if(num%2==0)
     {
    	 System.out.println(num+" number is EVEN");
     }
     else
     {
    	 System.out.println(num+" number is ODD");
     }
	}

}
