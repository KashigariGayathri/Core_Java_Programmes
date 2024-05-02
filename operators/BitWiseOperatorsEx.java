package operators;

import java.util.Scanner;

public class BitWiseOperatorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a2 and b2 :");
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		System.out.println("a&b : "+(a2&b2));
	    System.out.println("a|b : "+(a2|b2));
	    System.out.println("a^b : "+(a2^b2));
        sc.close();

	}

}
