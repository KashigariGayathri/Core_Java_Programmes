package collectionsFrameWorkEx;
import java.util.HashSet;
public class HashSetOperations {

	public static void main(String[] args) {
		// HashSet follows the random sequence to print values 
		//HashSet not print duplicate values
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(6);
		hashSet.add(1);
		hashSet.add(3);
		System.out.println(hashSet);
		HashSet<Integer> hashSet1=new HashSet<Integer>();
		hashSet1.add(1);
		hashSet1.add(3);
		hashSet1.add(5);
		hashSet1.add(15);
		hashSet1.add(17);
		System.out.println(hashSet1);
		//hashSet1.addAll(hashSet);//addAll is used to perform the UNION Operation
		//System.out.println(hashSet1);
		//hashSet1.retainAll(hashSet);//retainAll is used to perform the INTERSECTION Operation
		//System.out.println(hashSet1);
		//hashSet1.removeAll(hashSet);//removeAll is used for DIFFERENCE Operation
		//System.out.println(hashSet1);
		hashSet.removeAll(hashSet1);
		System.out.println(hashSet);
		hashSet.clear();
		System.out.println(hashSet);
	}
	

}
