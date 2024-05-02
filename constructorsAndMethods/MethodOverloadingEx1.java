package constructorsAndMethods;

public class MethodOverloadingEx1 {
	
//method overloading in same class
	    // Method with one parameter
	    public void display(int num) {
	        System.out.println("Number: " + num);
	    }

	    // Method with two parameters of different types
	    public void display(int num, String str) {
	        System.out.println("Number: " + num + ", String: " + str);
	    }

	    // Method with two parameters of different types (order reversed)
	    public void display(String str, int num) {
	        System.out.println("String: " + str + ", Number: " + num);
	    }

	    // Method with a different number of parameters
	    public void display(double num1, double num2) {
	        System.out.println("Number 1: " + num1 + ", Number 2: " + num2);
	    }

	    public static void main(String[] args) {
	        MethodOverloadingEx1 example = new MethodOverloadingEx1();
	        
	        // Calling methods with different signatures
	        example.display(10);
	        example.display(20, "Hello");
	        example.display("World", 30);
	        example.display(3.14, 2.71);
	    }
	}

	
