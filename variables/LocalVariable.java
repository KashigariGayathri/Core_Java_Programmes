package variables;

public class LocalVariable {
	public void StudentAge()
	{
	// Local variable 
	int age = 0;
	age = age + 30;
	System.out.println("Student age is : " + age);
	}
	public static void main(String[] args) {
		
		//Local Variable
		LocalVariable temp = new LocalVariable();
		temp.StudentAge();
		}
		

	}


