package oopsConceptExamples;
abstract class AbstractClasss{
    abstract void display();
    void msg() {//non abstract method
        System.out.println("Message method");
    }
}
class Abstact1 extends AbstractClasss{
    @Override
    void display() {
        System.out.println("display method");
        
    }
    
}
public class AbstractDemo {

	public static void main(String[] args) {
		 Abstact1 a=new Abstact1();
	        a.display();
	        a.msg();

	}

}
