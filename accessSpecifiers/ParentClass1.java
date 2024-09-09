package accessSpecifiers;

public class ParentClass1 {
	 private void privateMethod() {
	     System.out.println("Private method in ParentClass");
	 }

	 public void protectedMethod() {
	     privateMethod(); // Can access private method within the same class
	     System.out.println("Public method statement");
	 }
}
