package doselectExProgrammes;
import java.util.Scanner;
public class AttendenceScore {
	private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        long result = modularExponentiation(3, n, MOD);
        System.out.println(result);
    }

    private static long modularExponentiation(long base, int exponent, int mod) {
        long result = 1;
        base = base % mod;
        
        while (exponent > 0) {
            if ((exponent % 2) == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1; // equivalent to exponent / 2
            base = (base * base) % mod;
        }
        
        return result;
    }
}
