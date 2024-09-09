package doselectExProgrammes;
import java.util.Scanner;
// Functional interface for authentication
@FunctionalInterface
interface Authentication {
	boolean authenticate(String username, String password);
}
public class Source {

	// Method to validate username and password
	public boolean validate(String username, String password) {
		// Lambda expression to authenticate username and password
		Authentication auth = (u, p) -> "ABC".equals(u) && "DEF".equals(p);
		return auth.authenticate(username, password);
	}

	// Main method for testing
	public static void main(String[] args) {
		Source source = new Source();
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println(source.validate(a, b)); // Should print true

	}
}