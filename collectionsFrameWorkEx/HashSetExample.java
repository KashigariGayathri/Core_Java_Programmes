package collectionsFrameWorkEx;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("kashigari");
		hashset.add("kashigari");//HashSet doesn't allow multiple null values
		hashset.add(null);//it supports only one null values
		hashset.add("Gayathri");
		hashset.add("AVcollege");//HashSet will print Random Values
		hashset.add(null);//it supports multiple null values but only prints one null value
		hashset.add("Apple");
		hashset.add("Ball");
		System.out.println(hashset);

	}

}
