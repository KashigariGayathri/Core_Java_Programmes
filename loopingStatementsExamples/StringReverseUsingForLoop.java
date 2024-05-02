package loopingStatementsExamples;
import java.util.Scanner;
public class StringReverseUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String original = sc.nextLine();
		String rev="   ";
		
		
		System.out.println("The Original String is : "+original);
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
		 rev=rev+original.charAt(i);
		}
		System.out.println("The reversed String is : "+rev);

	}

}
