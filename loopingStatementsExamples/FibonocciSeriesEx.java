package loopingStatementsExamples;
import java.util.Scanner;
public class FibonocciSeriesEx {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The Positive Number : ");
	        int number = sc.nextInt();
	        
	        int num1 = 0, num2 = 1, num3;
	        if(number==1)
	        {
	        	System.out.println(num1);
	        }
	        if(number==2)
	        {
	        	System.out.print(num1 + " " + num2+" ");
	        }
	        if(number>2)
	        {
	        System.out.print(num1 + " " + num2+" ");
	        for (int i = 2; i < number; i++) 
	        {
	            num3 = num1 + num2;
	            System.out.print(num3 + " ");
	            num1 = num2;
	            num2 = num3;
	        }
	        }
	    }
	}