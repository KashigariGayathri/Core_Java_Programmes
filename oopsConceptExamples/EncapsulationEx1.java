package oopsConceptExamples;
class Product1{
    /*It has private attributes pID and pName to store the product ID and name, respectively.
Public getter and setter methods (getpID, setpID, getpName, setpName) are provided to 
access and modify these attributes. This ensures data encapsulation since the attributes are 
accessed and modified through methods rather than directly.
It has two constructors:
A parameterized constructor Product1(int pID, String pName) initializes the pID and pName 
attributes with the values passed as arguments.
A default constructor Product1() is provided.*/
	private int pID;
	private String pName;
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Product1(int pID, String pName) {  //constructor
		
		this.pID = pID;
		this.pName = pName;
	}
	public Product1() {
		
	}		
}

public class EncapsulationEx1 {

	public static void main(String[] args) {
		
		/*It contains the main method, which serves as the entry point of the program.
Inside the main method:
An instance of the Product1 class named p is created using the default constructor.
The setpID and setpName methods are used to set the values of pID and pName attributes, 
respectively.
The getpID and getpName methods are used to retrieve and print the values of pID and pName
 attributes.
Another instance of the Product1 class named p1 is created using the parameterized constructor,
 and its values are printed similarly.*/
			Product1 p=new Product1();
			p.setpID(101);
			p.setpName("Laptop");
			System.out.println(p.getpID()+ ": "+p.getpName());
			Product1 p1=new Product1(102,"Tablet");//creating object for constructor
			System.out.println(p1.getpID()+ ": "+p1.getpName());


	}

}
