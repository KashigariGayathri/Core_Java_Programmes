package collectionsFrameWorkEx;

import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		//processing time for the vector is more compare to other lists
				Vector<String> vector=new Vector<>();
				vector.add("kashigari");
				vector.add("Gayathri");
				vector.add("AVcollege");
				System.out.println(vector);
				vector.add(1,"Chaithanya");//this add adds the element at the specified position but doesn't replace
//				vector.add(3);
//				vector.add(4);
				System.out.println("Modified arrayList : "+vector);
				System.out.println("Array List size : "+vector.size());
				System.out.println("Get : "+vector.get(2));
				vector.set(3, "College");//set method replaces the element with new element
				System.out.println("Set : "+vector.size());
				System.out.println("Set : "+vector);
				vector.remove(1);
		        System.out.println(vector);
		        Vector<String> vector1 = new Vector<>();
		        // vector1.isEmpty();
		        System.out.println("Is Empty " + vector1.isEmpty());
		        vector1.addAll(vector);// Add all Elements.
		        vector1.add("EduBridge");
		        System.out.println(vector1);
//		        vector1.removeAll(vector1);
		         System.out.println(vector1);
		         Collections.sort(vector1);
		         //System.out.println(arrayList1);
		         for(String list : vector1)
		         {
		        	 System.out.print(list + " ");
		        	 
		         }
		         System.out.println();
		         System.out.println(vector1.contains("Gayathri"));
		         System.out.println("Iterator Ex");
		         Iterator<String> iterator = vector.iterator();  
		         
		         System.out.println("List elements : ");  
		     
		         while (iterator.hasNext())  
		             System.out.print(iterator.next() + " ");  
		     
		         System.out.println();
		         //Enumeration and Iterator both supported by vector class however Enumeration ks not Supported in ArrayList
		         System.out.println("Enumeration : ");
		         Enumeration<String> enumobject = vector.elements();  
		         System.out.println("Data in enumeration object is: ");  
		         while (enumobject.hasMoreElements()) {             
		        	    System.out.println("Element: " + enumobject.nextElement());
		        	}


	}

}
