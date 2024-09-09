package exceptionHandlingExamples;
import java.util.Scanner;
class MyMarksException extends Exception{
	public MyMarksException(String s) {//To print customized message
        super(s);
    }
}
 class MarksException {
	 String validMarks(int marks) throws MyMarksException  {
	        if(marks<0||marks>100) {
	            throw new MyMarksException("Marks should be in between 1 and 100");
	        }
	        else {
	            return "Valid Marks";
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarksException my=new MarksException();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks  : ");
        int marks=sc.nextInt();
        try {
            System.out.println(my.validMarks(marks));
        } catch (MyMarksException e) {
            System.out.println(e.getMessage());
        
        }


	}
}


