package arrayEx;

import java.util.Scanner;

class Occurence {
	int occurenceOfChar(String str) {
		String str1 = str.toLowerCase();
		// System.out.println("str :"+str1);
		int cnt = 0;
		String a[] = str1.split(" ");// the return type of spilt is string array
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("twinkle")) {
				cnt = cnt + 1;
			}
			// System.out.println(a[i]);

		}
		return cnt;
	}}

	public class StringOccUsingArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Occurence oc = new Occurence();
			int result = oc.occurenceOfChar("Twinkle Twinkle Little star, Twinkle Twinkle Big star");
			System.out.println("The no of times the word occured is :"+result);
		}

	}

