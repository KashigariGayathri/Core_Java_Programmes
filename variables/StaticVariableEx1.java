package variables;
class Student {
	// static variable 
	public static double fees;
	public static String name = "Pavan";
	}

public class StaticVariableEx1 {

	public static void main(String[] args) {
	
		Student.fees = 9999999.99;//just using class name we can access static variables
		System.out.println(Student.name + "'s annual fees : " + Student.fees);

	}

}
