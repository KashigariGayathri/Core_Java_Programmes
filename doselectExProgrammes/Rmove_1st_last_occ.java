package doselectExProgrammes;

import java.util.Scanner;

public class Rmove_1st_last_occ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter str : ");
		String str = scanner.nextLine();
		char C = 'a';

		String output = removeOccurrence(str, C);

		System.out.println(" Removing first and last occ :- " + output);

		scanner.close();

	}

	public static String removeOccurrence(String str, char C) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == C) {
				str = str.substring(0, i) + str.substring(i + 1);
				break;
			}
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == C) {
				str = str.substring(0, i) + str.substring(i + 1);
				break;
			}
		}

		return str;
	}

}
