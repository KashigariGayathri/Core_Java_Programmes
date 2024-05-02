package oopsConceptExamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arr = new ArrayList<>();
		arr = Arrays.asList("Varad", "Akash", "Sudhir", "Omkar");
		System.out.println(arr);
		for (String s11 : arr) {
			System.out.println(s11);
		}
		System.out.println(arr.size());
		arr.set(2, "om");
		System.out.println(arr);
		System.out.println(arr.get(3));
		arr.add(1, "Gouri");
		System.out.println("After add: "+arr);
	/*	arr.remove(2);
		System.out.println("After delete: "+arr);*/


	}

}
