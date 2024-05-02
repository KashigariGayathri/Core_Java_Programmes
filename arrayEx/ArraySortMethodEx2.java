package arrayEx;
import java.util.Arrays;
public class ArraySortMethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteArr[] = { 10, 20, 15, 22, 35 };
        char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
        int intArr[] = { 10, 20, 15, 22, 35 };
        double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
        float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
        short shortArr[] = { 10, 20, 15, 22, 35 };
 
        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);
        System.out.println("The Sorted byte array is : ");
        for(int i=0;i<byteArr.length;i++)
        {
        	System.out.print(+byteArr[i]+" ");
        }
        System.out.println();
        System.out.println("The Sorted char array is : ");
        for(int i=0;i<charArr.length;i++)
        {
        	System.out.print(+charArr[i]+" ");
        }
        System.out.println();
        System.out.println("The Sorted int array is : ");
        for(int i=0;i<intArr.length;i++)
        {
        	System.out.print(+intArr[i]+" ");
        }
        System.out.println();
        System.out.println("The Sorted double array is : ");
        for(int i=0;i<doubleArr.length;i++)
        {
        	System.out.print(+doubleArr[i]+" ");
        }
        System.out.println();
        System.out.println("The Sorted byte float array is : ");
        for(int i=0;i<floatArr.length;i++)
        {
        	System.out.print(+floatArr[i]+" ");
        }
        System.out.println();
        System.out.println("The Sorted short array is : ");
        for(int i=0;i<shortArr.length;i++)
        {
        	System.out.print(+shortArr[i]+" ");
        }
        

	}

}
