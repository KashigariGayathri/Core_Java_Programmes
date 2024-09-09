package collectionsFrameWorkEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraryListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("kashigari");
		//arrayList.add(null);//it supports multiple null values
		arrayList.add("Gayathri");
		arrayList.add("AVcollege");
		//arrayList.add(null);//it supports multiple null values
		System.out.println(arrayList);
		arrayList.add(1,"Chaithanya");//this add adds the element at the specified position but doesn't replace
//		arrayList.add(3);
//		arrayList.add(4);
		System.out.println("Modified arrayList : "+arrayList);
		System.out.println("Array List size : "+arrayList.size());
		System.out.println("Get : "+arrayList.get(2));
		arrayList.set(3, "College");//set method replaces the element with new element
		System.out.println("Set : "+arrayList.size());
		System.out.println("Set : "+arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        ArrayList<String> arrayList1 = new ArrayList<>();
        // arrayList1.isEmpty();
        System.out.println("Is Empty " + arrayList1.isEmpty());
        arrayList1.addAll(arrayList);// Add all Elements.
        arrayList1.add("EduBridge");
        System.out.println(arrayList1);
         arrayList1.removeAll(arrayList1);
         System.out.println(arrayList1);
         Collections.sort(arrayList1);
         //System.out.println(arrayList1);
         for(String list : arrayList)
         {
        	 System.out.print(list + " ");
        	 
         }
         System.out.println();
         System.out.println(arrayList1.contains("Gayathri"));
         
         System.out.println("Iterator Ex");
         Iterator<String> iterator = arrayList.iterator();  
         
         System.out.println("List elements : ");  
     
         while (iterator.hasNext())  
             System.out.print(iterator.next() + " ");  
     
         System.out.println();
         //Enumeration and Iterator both supported by vector class however Enumeration ks not Supported in ArrayList
         
	}

}
