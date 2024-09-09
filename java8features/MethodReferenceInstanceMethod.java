package java8features;
//Method reference to an Instance method of a class :
interface B {
    public  void add(int x, int y);
}

class Addition {
	public void sum(int a, int b) {
	    System.out.println("The sum is :"+(a+b));
	}
}
public class MethodReferenceInstanceMethod {

	public static void main(String[] args) {
		
			
			Addition addition = new Addition();
			//*** Using Lambda Expression ***//
			B b1 = (a,b) -> {System.out.println("The sum is :"+(a+b));};
			b1.add(10, 14);
			
			//*** Using Method Reference ***//
			B b2 = addition::sum;
			b2.add(100, 140);
	}

}
