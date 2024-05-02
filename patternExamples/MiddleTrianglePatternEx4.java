package patternExamples;

import java.util.Scanner;

public class MiddleTrianglePatternEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int s=sc.nextInt();	
		int i, j;
        for (i = 1; i <= s; i++) {
            for (j = 1; j <= s - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
               
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
