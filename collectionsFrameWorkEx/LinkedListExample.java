package collectionsFrameWorkEx;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.addFirst(23);
		ll.add(6);
		ll.offerLast(34);
		ll.offerFirst(20);
		System.out.println("Element in Linked List :"+ll);
		System.out.println("Element in peek or top most element: "+ll.peek());//this method displays the top most element
		System.out.println("Element in Linked List :"+ll);
		System.out.println("Element in pollfirst(remove first ) : "+ll.pollFirst());//this method removes and displays the top most element 
		System.out.println("Element in Linked List : "+ll);
		System.out.println("Element in Linked List using Iterator :");
		System.out.println("Element in pollfirst(remove  last ) : "+ll.pollLast());//this method removes and displays the last most element
		System.out.println("Element in Linked List : "+ll);
		System.out.println("Element in peek or last most element: "+ll.peekLast());//this method displays the last most element
		System.out.println("Element in peek or top most element: "+ll.peekFirst());//this method displays the top most element
		System.out.println("Element in peek or top most element: "+ll.pop());//this method removes and displays the top most element
		 Iterator<Integer> iter = ll.iterator();
		 System.out.println("List elements : ");  
	     
         while (iter.hasNext())  
             System.out.print(iter.next() + " ");  
     
         System.out.println();
		

	}

}
