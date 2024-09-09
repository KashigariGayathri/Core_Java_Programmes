package doselectExProgrammes;

import java.util.stream.Stream;

public class AliceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a stream and check if any string starts with "A"
        boolean b = Stream.of("Alice", "Bob").anyMatch(s -> {
            System.out.println(s);
            return s.startsWith("A");
        });

        // Output result based on the value of b
        if (b) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
	}

}
