package exceptionHandlingExamples;
import java.lang.Exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderEx {

	public static void main(String[] args) throws IOException,NumberFormatException
	{
		// TODO Auto-generated method stubNumberFormatException, IOException {
        //Scanner sc=new Scanner(System.in);
		
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter value of a: ");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Value of a: "+a);
        System.out.println("Enter Name: ");
        String nm=br.readLine();
        System.out.println("Name: "+nm);
        System.out.println("Enter the float value");
        float f=Float.parseFloat(br.readLine());
        System.out.println("float value : "+f);
        System.out.println("Enter the Double value");
        double d=Double.parseDouble(br.readLine());
        System.out.println("float value : "+d);

	}

}
