package operators;

import java.util.Scanner;

public class ShiftOperatorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shift Operator
		int c;
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of a  :");
        int a=sc.nextInt();
        System.out.println("Enter the value of b  :");
        int b=sc.nextInt();
        
        c = a >> 1; /* 12 = 0000 1100 */ // Right shift operator
		System.out.println("a >> 1 = " + c );
		c = a << 1; /* 200 = 1100 1000 */ // left shift operator
		System.out.println("a << 1 = " + c );

		c = a >> 2; /* 12 = 0000 1100 */ // Right shift operator
		System.out.println("a >> 2 = " + c );
		c = a << 2; /* 200 = 1100 1000 */ // left shift operator
		System.out.println("a << 2 = " + c );
		
		c = a >> b; /* 12 = 0000 1100 */ // Right shift operator
		System.out.println("a >> b = " + c );
		c = a << b; /* 200 = 1100 1000 */ // left shift operator
		System.out.println("a << b = " + c );
		
		sc.close();
	

	}

}
