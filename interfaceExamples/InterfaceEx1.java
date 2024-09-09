package interfaceExamples;
interface Paren1{
	
	//in interface we can only create default , abstract, and static methods
    void msg();//by default method is abstract and public
    static void disp() {
        System.out.println("Parent 1 static method");
    }
    default void disp1() {
        System.out.println("Parent 1 default method");
    }
}
interface Paren2{
    void msg1();
}
class Chil implements Paren1,Paren2{
    @Override
    public void msg() {
        System.out.println("Parent 1 method");
        
    }
    @Override
    public void msg1() {
        System.out.println("Parent 2 method");
        
    }
    
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Chil c=new Chil();
	        c.msg();
	        Paren1.disp();
	        c.msg1();
	        c.disp1();

	}

}
