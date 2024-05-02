package arrayEx;
import java.util.Scanner;
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("the elements you provided are :");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
		

	}

}
