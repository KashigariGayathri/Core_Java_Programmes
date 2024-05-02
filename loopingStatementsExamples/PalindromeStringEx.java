package loopingStatementsExamples;
import java.util.Scanner;
public class PalindromeStringEx {
	public static String reverseStr(String str)

	{
		 char[] characters = str.toCharArray();
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
	        return new String(reversed);

	}
	public static void main(String[] args) {
		
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the string to be reversed : ");
				String original = sc.nextLine();
				
				String rev=reverseStr(original);
				System.out.println("The Original String is : "+original);
				System.out.println("The reversed String is : "+rev);
				if(original.equals(rev))
				{
					System.out.println("Palindrome String");
				}
				else
				{
					System.out.println("Not a Palindrome String");
				}
				

	}

}
