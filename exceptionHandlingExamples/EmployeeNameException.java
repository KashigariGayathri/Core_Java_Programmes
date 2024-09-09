package exceptionHandlingExamples;

import java.util.Scanner;

class MyNameException extends Exception {
	public MyNameException(String s) {// To print customized message
		super(s);
	}
}

public class EmployeeNameException {
//	 String validName(String fName,String lName) throws MyNameException  {
//	        if(fName.isEmpty()||lName.isEmpty()) {
//	            throw new MyNameException("First and Last Name should not be empty");
//	        }
//	        else {
//	            return  fName + lName;
//	        }
//	    }
public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeNameException emp = new EmployeeNameException();
		Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first Name and Last Name  : ");
//        String fName=sc.nextLine();
//        String lName=sc.nextLine();
		String fName = "    ";

		String lName = "Edu bridge";
		try {
			System.out.println(emp.validName(fName, lName));
		} catch (MyNameException e) {
			System.out.println(e.getMessage());
		}

	}

	String validName(String fName, String lName) throws MyNameException {
		if (fName.isBlank() || lName.isBlank()) {
			throw new MyNameException("First and Last Name should not be empty");
		} else {
			return fName + lName;
		}
	}

}
