package collectionsFrameWorkEx;
import java.util.PriorityQueue;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pq.add(5);
        pq.add(10);
        pq.add(3);
        pq.add(7);

        // Printing the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Peek: Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("Peek: " + pq.peek());

        // Poll: Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("Poll: " + pq.poll());

        // Printing the PriorityQueue after poll operation
        System.out.println("PriorityQueue after poll: " + pq);

        // Adding more elements
        pq.add(1);
        pq.add(15);

        // Printing the PriorityQueue after adding more elements
        System.out.println("PriorityQueue after adding more elements: " + pq);

        // Size: Returns the number of elements in the PriorityQueue.
        System.out.println("Size: " + pq.size());

        // Checking if PriorityQueue is empty
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty());
    

	}

}
