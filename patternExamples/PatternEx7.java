package patternExamples;

import java.util.Scanner;

public class PatternEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int s=sc.nextInt();	
		 int alphabet = 97;//small alphabets in ascii range from 97 to 122
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
