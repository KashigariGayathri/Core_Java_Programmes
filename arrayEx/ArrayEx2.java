package arrayEx;

import java.util.Scanner;

public class ArrayEx2 {
	public static void arrayex()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextLine();
        }
        System.out.println("the elements you provided are :");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEx2 ex=new ArrayEx2();
		ex.arrayex();
		

	}

}
