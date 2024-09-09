package collectionsFrameWorkEx;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the Stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Displaying the Stack
        System.out.println("Stack: " + stack);
        // Displaying first element
        System.out.println(stack.peek());

        // Popping an element from the Stack
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Displaying the Stack after popping
        System.out.println("Stack after pop: " + stack);
        
        // Peeking at the top element of the Stack
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        
     // Checking if the Stack is empty
        System.out.println("Is Stack empty? " + stack.isEmpty());

        // Clearing the Stack
        stack.clear();
        System.out.println("Stack after clear: " + stack);

        // Checking the size of the Stack
        System.out.println("Size of Stack: " + stack.size());
        
        

	}

}
