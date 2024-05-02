package arrayEx;
import java.util.Arrays;
public class ArrayBinarySearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charArr1[] = { 'a', 'c', 'e', 'g', 'h' };
        
        char key = 'h';
        
        int foundItemIndex = Arrays.binarySearch(charArr1, key);
        
        System.out.println("The given character is at index: " + foundItemIndex);


	}

}
