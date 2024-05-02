package oopsConceptExamples;

public class Bicycle {
	String bName;
	String bPrice;
    //constructor have the same name as class name
	//constructor do not have a return type
	public Bicycle(String name, String price) {// PAramerterised constructor
		bName = name;
		bPrice = price;
	}
	Bicycle(){//Default constructor
		bName="Ladybird";
		bPrice="5000";
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbPrice() {
		return bPrice;
	}

	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}
	void display() {
		System.out.println(bName+ " : "+bPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle=new Bicycle("Hero", "10000");
		bicycle.display();
		Bicycle bicycle1=new Bicycle();
		bicycle1.display();
		


	}

}
