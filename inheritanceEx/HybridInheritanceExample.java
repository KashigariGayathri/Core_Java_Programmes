package inheritanceEx;


//Interface 1
interface A {
 void methodA();
}

//Interface 2
interface B {
 void methodB();
}

//Class implementing Interface A
class ClassA implements A {
 public void methodA() {
     System.out.println("ClassA implements methodA");
 }
}

//Class implementing Interface B
class ClassB implements B {
 public void methodB() {
     System.out.println("ClassB implements methodB");
 }
}

//Class inheriting from ClassA and implementing Interface B
class ClassC extends ClassA implements B {
 public void methodB() {
     System.out.println("ClassC implements methodB");
 }
}
public class HybridInheritanceExample {
	

	public static void main(String[] args) {
		ClassC obj = new ClassC();
        obj.methodA(); // Output: ClassA implements methodA
        obj.methodB(); // Output: ClassC implements methodB

	}

}
