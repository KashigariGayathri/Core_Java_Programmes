package collectionsFrameWorkEx;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet=new TreeSet<String>();
		
		treeSet.add("kashigari");
		treeSet.add("kashigari");//TreeSet allows duplicate values values
		//treeSet.add(null);//it does not supports  null values
		treeSet.add("Gayathri");
		treeSet.add("AVcollege");//TreeSet will print Values in ascii order
		//treeSet.add(null);//it supports multiple null values but only prints one null value
		treeSet.add("Apple");
		treeSet.add("Ball");
		treeSet.add("apple");
		System.out.println(treeSet);
		System.out.println("*****Using Iterator************");
        Iterator<String> i = treeSet.iterator();
        while(i.hasNext()) 
            System.out.println(i.next());
        System.out.println("*****Using decreding Iterator************");
        Iterator<String> i1 = treeSet.descendingIterator();
        while(i1.hasNext()) 
            System.out.println(i1.next());
	}

}
