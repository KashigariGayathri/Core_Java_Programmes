package accessSpecifiers;
//1) Same package subclass
class ParentClass {
 private void privateMethod() {
     System.out.println("Private method in ParentClass");
 }

 protected void protectedMethod() {
     privateMethod(); // Can access private method within the same class
     System.out.println("Protected method statement");
 }
}

class ChildClass extends ParentClass {
 public void accessMethod() {
     // privateMethod(); // Error: The method privateMethod() from the type ParentClass is not visible
     protectedMethod(); // Can access protected method in the same package subclass
 }
}

//2) Same package non subclass
class SamePackageNonSubclass {
 public void accessMethod(ParentClass pc) {//Here we are passing parent class object because this class is not a sub class of parent class
	 //so to access parent class methods and variables in non sub Class we have to pass object of parent class 
     // obj.privateMethod(); // Error: The method privateMethod() from the type ParentClass is not visible
    pc.protectedMethod(); // Can access protected method in the same package
	 System.out.println("This will be executed");
 }
}
public class PrivateEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass pc=new ParentClass();
		pc.protectedMethod();
		ChildClass cc=new ChildClass();
		cc.accessMethod();
		SamePackageNonSubclass sp=new SamePackageNonSubclass();
		sp.accessMethod(pc);

	}

}
