package exceptionHandlingExamples;

public class CheckedExceptionEx1 {
//checked exception is compile time exception
	//unchecked exception is run time time exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            //Class.forName("basic.Demo12334");
	            Class.forName("arrayEx.ArrayEx1");
	            System.out.println("Class Found");
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            System.out.println("Class not Found " +e);
	        }

	}

}
