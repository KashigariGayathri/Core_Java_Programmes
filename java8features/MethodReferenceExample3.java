package java8features;

import java.util.function.Supplier;

public class MethodReferenceExample3 {
	static String staticMethod() {
        return "Hello, static method!";
    }

    String instanceMethod() {
        return "Hello, instance method!";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Reference to a static method
        Supplier<String> staticRef = MethodReferenceExample3::staticMethod;
        System.out.println(staticRef.get());

        // Reference to an instance method of a particular object
        MethodReferenceExample3 mre3 = new MethodReferenceExample3();
        Supplier<String>  instanceRef= mre3::instanceMethod;
        System.out.println(instanceRef.get());

        // Reference to an instance method of an arbitrary object of a particular type
        String str = "Hello, instance method of an arbitrary object!";
        Supplier<Integer> arbitraryRef = str::length;
        System.out.println(arbitraryRef.get());

        // Reference to a constructor
        Supplier<MethodReferenceExample3> constructorRef = MethodReferenceExample3::new;
        System.out.println(constructorRef.get());
	}

}
