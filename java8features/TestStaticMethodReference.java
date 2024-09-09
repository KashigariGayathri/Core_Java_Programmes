package java8features;
@FunctionalInterface
interface A1 {
    public boolean checkSingleDigit(int x);
}
class Digit1 {
    public static boolean isSingleDigit(int x) {
        return x > -10 && x < 10;
    }
    public boolean isSingleDigit1(int x) {
        return x > -10 && x < 10;
    }
}
public class TestStaticMethodReference {

	public static void main(String[] args) {
		//*** Using Lambda Expression ***//
        A1 a1 = (x) -> { return x > -10 && x < 10;};
        System.out.println(a1.checkSingleDigit(10));//false
        
        //*** Using Method Reference  for static method***//
            //classname::method name;
        A1 a2 = Digit1::isSingleDigit;
        System.out.println(a2.checkSingleDigit(9));//true
        
        //*** Using Method Reference  for non static method***//
            //objectname::method name;
        Digit1 d=new Digit1();
        A1 a3=d::isSingleDigit1;
        System.out.println(a3.checkSingleDigit(19));

	}

}
