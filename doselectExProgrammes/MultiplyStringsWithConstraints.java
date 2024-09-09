package doselectExProgrammes;

public class MultiplyStringsWithConstraints {
	public static String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		int len1 = num1.length();
		int len2 = num2.length();
		int[] result = new int[len1 + len2];

		// Reverse the numbers to facilitate multiplication from least significant digit
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();

		// Multiply each digit and store the result
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				result[i + j] += product;
				result[i + j + 1] += result[i + j] / 10;
				result[i + j] %= 10;
			}
		}

		// Convert the result array back to a string
		StringBuilder sb = new StringBuilder();
		for (int i = result.length - 1; i >= 0; i--) {
			if (!(sb.length() == 0 && result[i] == 0)) {
				sb.append(result[i]);
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		// Sample input
		String A = "5";
		String B = "5";

		// Call the function with sample input and print the result
		System.out.println(multiply(A, B)); // Output: 25
	}

}
