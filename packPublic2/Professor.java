package packPublic2;


import packPublic1.University;
public class Professor 
{
	 public void accessMethod(University pc) {
	         pc.book(); // Error: The method privateMethod() from the type ParentClass is not visible
	         pc.book(); // Error: The method protectedMethod() from the type ParentClass is not visible
	    	System.out.println("this is default statement");
}
}
