package java8features;
@FunctionalInterface
interface SpaceBetweenInterface1 {
    String addSpace(String str);
}
public class SpaceBetweenInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpaceBetweenInterface1 spaceBetweenInterface = str -> String.join(" ", str.split(""));
	        String originalString = "Hello";
	        String stringWithSpace = spaceBetweenInterface.addSpace(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("String with Space: " + stringWithSpace);
	}

}
