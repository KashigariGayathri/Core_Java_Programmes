package arrayEx;

public class ArrayShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Shallow copy (Multidimension) means both arrays are pointing to the same memory 
		 * address. If any one of these array is modified other array get auto reflected.*/
		int intArray[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int cloneArray[][] = intArray.clone();//by using clone method we are copying
		// shallow copy is created following print statement will print true 
		//shallow copy is faster becare both are pointing to the same address
		System.out.println(intArray[0] == cloneArray[0]); 
		System.out.println(intArray[1] == cloneArray[1]);
		

	}

}
