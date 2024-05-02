package loopingStatementsExamples;
import java.util.Scanner;
public class StringReverseWithoutStringBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String original = sc.nextLine();
        char[] characters = original.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        char temp;
        while (left < right) {
            // Swap characters
            temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            // Move towards the middle
            left++;
            right--;
        }
        String reversed = new String(characters);
        System.out.println("Reversed string: " + reversed);

	}

}
