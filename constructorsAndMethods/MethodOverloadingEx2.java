package constructorsAndMethods;
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class MethodOverloadingEx2 {
    public static void main(String[] args) {
		        Calculator calculator = new Calculator();

		        // Calling the method with two integers
		        int sum1 = calculator.add(5, 7);
		        System.out.println("Sum of 5 and 7 is: " + sum1);

		        // Calling the method with three integers
		        int sum2 = calculator.add(2, 4, 6);
		        System.out.println("Sum of 2, 4, and 6 is: " + sum2);

	}

}
