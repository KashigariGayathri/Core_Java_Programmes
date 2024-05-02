package arrayEx;

import java.util.Arrays;

public class ArraySortMethodEx {

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
        
        System.out.println("Sorted array: " + Arrays.toString(byteArr));
        System.out.println("Sorted array: " + Arrays.toString(charArr));
        System.out.println("Sorted array: " + Arrays.toString(intArr));
        System.out.println("Sorted array: " + Arrays.toString(doubleArr));
        System.out.println("Sorted array: " + Arrays.toString(floatArr));
        System.out.println("Sorted array: " + Arrays.toString(shortArr));
	}

}
