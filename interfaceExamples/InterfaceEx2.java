package interfaceExamples;

//class to class --> extends
//interface to interface ==>extends
//interface to class -->implements
interface ABC {
	public void print_ABC();
}

interface XYZ {
	public void print_XYZ();
}

interface PQR extends ABC, XYZ {
	public void print_PQR();
}

class child implements PQR {
	public void print_ABC() {
		System.out.println("Cooking");
	}

public void print_XYZ()
{
System.out.println("Emerging Technology");
}

public void print_PQR()
{
System.out.println("IoT");
}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child d = new child();
				d.print_ABC(); 
				d.print_XYZ(); 
				d.print_PQR();

	}

}
