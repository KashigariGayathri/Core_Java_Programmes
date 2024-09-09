package accessSpecifiers;
/*The protected access specifier in Java allows members to be accessed 
 * within the same class, subclasses, and classes in the same package. 
 * This means that protected members can be accessed by the class itself, 
 * its subclasses (even if they are in a different package), and other
 *  classes in the same package.*/
//same package sub class
 class Forest
{
  protected String str1="trees";
  protected String str2="animals";
  protected void woods()
  {
	 System.out.println("The concatination of two strings : "+(str1+str2)); 
  }
}
class River extends Forest
{
	protected String str3="river";
	protected void woods2()
	{
		woods();
		System.out.println("The woods2 method protected string is :"+str3);
	}
}
//same package non sub class
class Forest1
{
	public void woods3(River ri) {
		//Here we are passing parent class object because this class is not a sub class of parent class
			 //so to access parent class methods and variables in non sub Class we have to pass object of parent class 
		     ri.woods(); 
		     ri.woods2(); 
			 System.out.println("This will be executed");
	}
}
public class ProtectedEx1 {

	public static void main(String[] args) {
		Forest fo=new Forest();
		River ri=new River();
		ri.woods2();
		ri.woods();
		Forest1 fo1=new Forest1();
		fo1.woods3(ri);

	}

}
