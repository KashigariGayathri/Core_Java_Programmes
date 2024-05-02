package arrayEx;
import java.util.Scanner;
public class MultiDimensionArrayEx {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=sc.nextInt();
        int a[][]=new int[size][size];
        int b[][]=new int[size][size];
       // int c[][]=new int[size][size];
        System.out.println("Enter the elements for matrix A : ");
        for(int i=0;i<size;i++)
        {        for (int j = 0; j < size; j++)
                 {
                     a[i][j]=sc.nextInt();
                 }
        }
        System.out.println("Enter the elements for matrix B : ");
        for(int i=0;i<size;i++)
        { for (int j = 0; j < size; j++)
                 {
                     b[i][j]=sc.nextInt();
                 }
        }
        for(int i=0;i<size;i++)
        { for (int j = 0; j < size; j++)
                 {
                    System.out.println("at A matrix "+i+ " "+j+ " : "+a[i][j]);
                 }
        }
        for(int i=0;i<size;i++)
        { for (int j = 0; j < size; j++)
                 {
                    System.out.println("at B matrix  "+i+ " "+j+ " : "+b[i][j]);
                 }
        }
    }}
        
	
