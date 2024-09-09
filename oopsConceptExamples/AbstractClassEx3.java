package oopsConceptExamples;
abstract class Arithmetic1
{
    int a=10;
    int b=12;
    abstract void arithmetic1();
}
class Addition1 extends Arithmetic1
{

	@Override
	void arithmetic1() {
        System.out.println("The Addition Of " +a+ " and " +b+ " : " +(a+b));
		
	}
	
}
class Subtraction1 extends Arithmetic1
{

	@Override
	void arithmetic1() {
        System.out.println("The Subtraction Of " +a+ " and "+b+ " : " + (b-a));
		
	}
    
}
class Multiplication1 extends Arithmetic1
{

	@Override
	void arithmetic1() {
        System.out.println("The Multiplication Of " +a+ " and "+b+ " : " + (b*a));		
	}
    
}
class Division1 extends Arithmetic
{

	@Override
	void arithmetic() {
        System.out.println("The division Of " +a+ " by "+b+ " : " + (a/b));
		
	}
    
}

public class AbstractClassEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Addition a=new Addition();
	        a.arithmetic();
	        Subtraction s=new Subtraction();
	        s.arithmetic();
	        Multiplication m=new Multiplication();
	        m.arithmetic();
	        Division d=new Division();
	        d.arithmetic();

	}

}
