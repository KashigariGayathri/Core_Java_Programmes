package java8features;
//Method reference to a static method of a class :
interface A {
	public boolean checkSingleDigit(int x);
}

class Digit {
	public static boolean isSingleDigit(int x) {
	    return x > -10 && x < 10;
	}
}
public class MethodRefereceStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*** Using Lambda Expression ***//
				A a1 = (x) -> { return x > -10 && x < 10;};
				System.out.println(a1.checkSingleDigit(10));
				
				//*** Using Method Reference ***//
				A a2 = Digit::isSingleDigit;
				System.out.println(a2.checkSingleDigit(9));
	}

}
