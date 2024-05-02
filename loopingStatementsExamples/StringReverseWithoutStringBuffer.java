package loopingStatementsExamples;

public class StringReverseWithoutStringBuffer {
	public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        char[] reversed = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            reversed[input.length() - 1 - i] = input.charAt(i);
        }
        return new String(reversed);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original = "hello";
	        String reversed = reverse(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);

	}

}
