package exceptionHandlingExamples;

public class ArrayIndexOutOfBoundEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int a=5,b=2;
            int c=a/b;//2.5
            System.out.println("Value of c: "+c);
            int arr[]= {2,3,4};
            System.out.println("Array : "+arr[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by zero");
            e.getMessage();
        }
        catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1);
            
        }
        finally {
            System.out.println("End of the code");
        }

	}

}
