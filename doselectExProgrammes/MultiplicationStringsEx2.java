package doselectExProgrammes;
//import java.math.BigInteger;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
class Result {
	    public static String string_multiply(String A, String B) {
	        BigInteger num1 = new BigInteger(A);
	        BigInteger num2 = new BigInteger(B);
	        BigInteger result = num1.multiply(num2);
	        return result.toString();
	    }}
public class MultiplicationStringsEx2 {
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         //  System.out.println("Enter 1st number:");
        String A = bufferedReader.readLine();
         //  System.out.println("Enter 2nd number:");
        String B = bufferedReader.readLine();
        String result = Result.string_multiply(A, B);
        System.out.println(result);
        bufferedReader.close();
	}

}
