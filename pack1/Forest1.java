package pack1;


public class Forest1 {
	public void woods3(River ri) {
		//Here we are passing parent class object because this class is not a sub class of parent class
			 //so to access parent class methods and variables in non sub Class we have to pass object of parent class 
		     ri.woods(); 
		     ri.woods2(); 
			 System.out.println("This will be executed");
	}

}
