package doselectExProgrammes;
import java.util.Scanner;
import java.math.BigInteger;
class Multiply {
	public static String multiplyLargeNumbers(String A, String B) {

		BigInteger num1 = new BigInteger(A);
		BigInteger num2 = new BigInteger(B);
		BigInteger result = num1.multiply(num2);
        return result.toString();
	}
}

public class LargeNumberMultiplication {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter 1st no:");
		String A = scanner.nextLine();
		// System.out.println("Enter 2st no:");
		String B = scanner.nextLine();
        String result = Multiply.multiplyLargeNumbers(A, B);
        System.out.println("result " + result);
        scanner.close();
}
}
