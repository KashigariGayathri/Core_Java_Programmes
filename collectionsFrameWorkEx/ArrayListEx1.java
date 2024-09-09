package collectionsFrameWorkEx;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> a1=new ArrayList<>();
a1.add(10);
a1.add(3);
a1.add(4);
a1.add(2,20);//this add adds the element at the specified position but doesn't replace
a1.add(3);
a1.add(4);
System.out.println("My arrayList : "+a1);
System.out.println("Array List size : "+a1.size());
System.out.println("Get : "+a1.get(4));
a1.set(4, 34);//set method replaces the element with new element
System.out.println("Set : "+a1);
	}

}
