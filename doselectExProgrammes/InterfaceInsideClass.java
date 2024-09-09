package doselectExProgrammes;

public class InterfaceInsideClass {
	public interface InnerInterface {
        void display();
    }
    
    // Class implementing the inner interface
    public class InnerClass implements InnerInterface {
        @Override
        public void display() {
            System.out.println("Inner interface method implemented in inner class.");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceInsideClass outer = new InterfaceInsideClass();
        InnerClass inner = outer.new InnerClass();
        inner.display();
    }
	}


