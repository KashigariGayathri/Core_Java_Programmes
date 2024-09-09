package fileExamples;
import java.io.File;
import java.io.IOException;
public class FileCreateEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File newFile=new File("D:/CoreJavaProgrames/src/fileExamples/file3.txt");
		//File newFile=new File("D:/demo11785.txt");
		//  File file = new File("F:demo.txt");
        if (newFile.createNewFile()) { 
        System.out.println("File created.");
        } else {
        System.out.println("File exists.");

	}

}
}
