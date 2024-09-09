package java8features;

// Functional interface for Even Odd Detection
@FunctionalInterface
interface EvenOdd {
    String evenOdd(int num);
}

public class EvenOddLambdaEx {

    public static void main(String[] args) {
        // Lambda expression to check even or odd
        EvenOdd even = (int num) -> (num % 2 == 0) ? "Even" : "Odd";
        
        // Calling the method evenOdd on the functional interface
        System.out.println("Number 4 is " + even.evenOdd(4)); 
        System.out.println("Number 7 is " + even.evenOdd(7)); 
    }
}
