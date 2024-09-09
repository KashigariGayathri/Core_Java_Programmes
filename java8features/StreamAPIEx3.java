package java8features;

import java.util.stream.IntStream;

public class StreamAPIEx3 {
	static int n = 13;
    private static boolean isPrime(int number) {
        return number>1 && IntStream.range(2, number).noneMatch(i->number%i==0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime checking...."+isPrime(n));
	}

}
