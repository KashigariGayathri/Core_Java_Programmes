package arrayEx;
import java.util.Scanner;
public class MultiDimensionArrayEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=sc.nextInt();
        int a[][]=new int[size][size];
        int b[][]=new int[size][size];
        int c[][]=new int[size][size];
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
		{
			for(int j=0;j<size;j++)
			{
				for(int k=0;k<size;k++)
				{
				c[i][j]=a[i][j]+b[i][j];
				}
			}
    
            }
		 System.out.println("First Matrix:");
         for (int i = 0; i < size; i++) 
         {
             for (int j = 0; j < size; j++) 
             {
                 System.out.print(a[i][j]+" ");
             }
             System.out.println("");
         }
         System.out.println("Second Matrix:");
         for (int i = 0; i < size; i++) 
         {
             for (int j = 0; j < size; j++) 
             {
                 System.out.print(b[i][j]+" ");
             }
             System.out.println("");
         }
         System.out.println("Matrix after addition:");
         for (int i = 0; i < size; i++) 
         {
             for (int j = 0; j < size; j++) 
             {
                 System.out.print(c[i][j]+" ");
             }
             System.out.println("");
         }

		
            
        

	}

}
