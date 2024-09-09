package exceptionHandlingExamples;
//import java.io.FileNotFoundException;
//import java.io.File;
//public class FileNotFoundExceptionEX {
//
//	public static void main(String[] args) throws FileNotFoundException , IOException {
//		// TODO Auto-generated method stub
//		File f = new File("f:/file333pooja.txt");
//        if(!f.exists()){
//        throw new Exception("File doesnot exist "+f.toString());
//        }
//        else {
//        System.out.println("Welcome, we got into file "+f.toString());
//        }
//
//	}
//
//}
import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionEX {

    public static void main(String[] args) throws FileNotFoundException {
        //File f = new File("f:/file333pooja.txt");//file doesn,t present so gives exception
        File f = new File("D:/BTS");//file present
        if (!f.exists()) {
            throw new FileNotFoundException("File does not exist: " + f.toString());
        } else {
            System.out.println("Welcome, we got into file: " + f.toString());
        }
    }
}

