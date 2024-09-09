package doselectExProgrammes;

public class CharAssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char ch = 'A'; // 'A' has a Unicode value of 65
	        System.out.println("Initial value: " + ch); // Prints 'A'

	        // Using the assignment operator
	        ch += 1; // Equivalent to ch = (char)(ch + 1);
	        System.out.println("After += 1: " + ch); // Prints 'B' because 'B' has a Unicode value of 66

	        // Resetting to 'A'
	        ch = 'A';

	        // Using the increment operator
	        ch++; // Equivalent to ch = (char)(ch + 1);
	        System.out.println("After ch++: " + ch); // Prints 'B'

	        // Resetting to 'A'
	        ch = 'A';

	        // Using the assignment operator with a negative value
	        ch -= 1; // Equivalent to ch = (char)(ch - 1);
	        System.out.println("After -= 1: " + ch); // Prints '@' because '@' has a Unicode value of 64

	        // Resetting to 'A'
	        ch = 'A';

	        // Using the multiplication assignment operator
	        ch *= 2; // This will result in a character with a Unicode value of 130 (which is not printable in ASCII)
	        System.out.println("After *= 2: " + (int)ch); // Prints the Unicode value of the character

	        // Resetting to 'A'
	        ch = 'A';

	        // Using the division assignment operator
	        ch /= 2; // This will result in a character with a Unicode value of 32 (space character)
	        System.out.println("After /= 2: " + (int)ch); // Prints the Unicode value of the character

	        // Resetting to 'A'
	        ch = 'A';

	        // Using the modulo assignment operator
	        ch %= 40; // This will result in a character with a Unicode value of 25 (non-printable control character)
	        System.out.println("After %= 40: " + (int)ch); // Prints the Unicode value of the character
	}

}
