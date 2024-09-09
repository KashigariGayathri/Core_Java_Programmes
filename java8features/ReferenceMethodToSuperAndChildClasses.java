package java8features;
//Reference to super class & child class method using super & this keyword
interface AOne {
	public void sayHello();
}

class SuperClass {
	public void superHello(){
		System.out.println("I am inside SuperTest class");
	}
}

class ChildClass extends SuperClass{
	
	public void childHello() {
		System.out.println("I am inside SubTest class");
	}
public void testHello() {
		
		//***Using Method reference :super class method***//
		AOne a1= super::superHello;
		a1.sayHello();
		
		//***Using Lambda Expression :super class method***//
		AOne a3= () -> System.out.println("I am inside SuperTest class");
		a3.sayHello(); 
		
		//***Using Method reference :current class method***//
		AOne a2= this::childHello;
		a2.sayHello();
		
		//***Using Lambda Expression :current class method***//
		AOne a4= () -> System.out.println("I am inside SubTest class");
		a4.sayHello();
	}
}
public class ReferenceMethodToSuperAndChildClasses {
public static void main(String[] args) {	
		
		ChildClass t = new ChildClass();
		t.testHello();
	}

}
