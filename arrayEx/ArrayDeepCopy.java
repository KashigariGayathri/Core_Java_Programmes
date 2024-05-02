package arrayEx;

public class ArrayDeepCopy {

	public static void main(String[] args) {
		// Deep copy is used for single dimension array
		//Deep copy means a variable would have a copy of the original array 
		//in a different memory location.

		int intArray[] = {0,1,2,3,4,5,6,7,8,9};
		int cloneArray[] = intArray.clone();
		// Deep copy is created following print statement will print false
		System.out.println(intArray == cloneArray);
		for (int i = 0; i < cloneArray.length; i++) { 
		System.out.print(cloneArray[i]+" ");
		}

	}

}
