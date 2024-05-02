package loopingStatementsExamples;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed :");
		String str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());

	}

}
