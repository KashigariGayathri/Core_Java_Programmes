package accessSpecifier2;

import accessSpecifiers.ParentClass1;
//Different package subclass
class DifferentPackageChildClass extends ParentClass1 {
    public void accessMethod() {
        // privateMethod(); // Error: The method privateMethod() from the type ParentClass is not visible
        protectedMethod(); // Can access protected method in the different package subclass
    }
}
//Different package non subclass
class DifferentPackageNonSubclass {
    public void accessMethod(ParentClass1 pc) {
        // pc.privateMethod(); // Error: The method privateMethod() from the type ParentClass is not visible
        // pc.protectedMethod(); // Error: The method protectedMethod() from the type ParentClass is not visible
    	System.out.println("this is default statement");
    }
}
public class AnotherPackageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ParentClass1 pc= new ParentClass1() ;
    pc.protectedMethod();
    DifferentPackageChildClass dpc=new DifferentPackageChildClass();
    dpc.accessMethod();
    DifferentPackageNonSubclass dpns=new DifferentPackageNonSubclass();
    dpns.accessMethod(dpc);
	}

}
