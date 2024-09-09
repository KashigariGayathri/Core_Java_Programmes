package doselectExProgrammes;
interface OuterInterface {
    // Inner class
    class InnerClass {
        public void display() {
            System.out.println("Inner class inside interface.");
        }
    }
}
public class ClassInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OuterInterface.InnerClass inner = new OuterInterface.InnerClass();
        inner.display();

	}

}
