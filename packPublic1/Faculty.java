package packPublic1;

import pack1.River;

public class Faculty {
	public void book2(College col) {
		//Here we are passing parent class object because this class is not a sub class of parent class
			 //so to access parent class methods and variables in non sub Class we have to pass object of parent class 
		     col.book(); 
		     col.book1(); 
			 System.out.println("This will be executed");
}
}