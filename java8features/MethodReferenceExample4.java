package java8features;
//we can create many number of Functional Interfaces in a class but in one interface only one abstract method must be defined
@FunctionalInterface
interface MultplicationInterface
{
public void multiply(int a,int b);
}
@FunctionalInterface
interface AdditionInterface
{
	public int addition(int a,int b);
}
public class MethodReferenceExample4 {
public static void mul(int a, int b)//Static method
{
	System.out.println("The multiplication is : " +a*b);
}
public int add(int a, int b)//instance method
{
	return a+b;
}
public static void main(String[] args)
{
	///**** Using Method Reference  for static method***//
            //classname::method name;
       // A a2 = Digit::isSingleDigit;
        //System.out.println(a2.checkSingleDigit(9));//true*/
	MultplicationInterface  mre=MethodReferenceExample4::mul;//Static method is called using classname::methodname
	mre.multiply(3, 4);//here we have to provide the abstract method
	MethodReferenceExample4 mre4=new MethodReferenceExample4();//instance method is called using classobject::instancemethod
	AdditionInterface add=mre4::add;
	int a=add.addition(3,4);//here we have to provide the abstract method
	System.out.println("The addition is : "+a);
}
}
