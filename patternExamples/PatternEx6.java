package patternExamples;

import java.util.Scanner;

public class PatternEx6 {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size : ");
				int s=sc.nextInt();	
				 int alphabet = 65;//Capital alphabets in ascii range from 65 to 90
		     for (int i = 0; i<= s; i++)
		     {
		        for (int j = 0; j <= i; j++)
		        {
		           System.out.print((char)(alphabet+j) + " ");
		        }
		      
		         System.out.println();
		     }

	}

}
