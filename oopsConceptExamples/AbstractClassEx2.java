package oopsConceptExamples;
import java.util.Scanner;
abstract class Arithmetic
{
	//we can create normal methods and variables in abstract class
    int a=10;
    int b=12;
    abstract void arithmetic();
}
class Addition extends Arithmetic
{
    public void arithmetic()
    {
        System.out.println("The Addition Of " +a+ " "+b+ " : " +(a+b));
    }
}
class Subtraction extends Arithmetic
{
    public void arithmetic()
    {
        System.out.println("The Subtraction Of " +a+ " "+b+ " : " + (b-a));
    }
}
class Multiplication extends Arithmetic
{
    public void arithmetic()
    {
        System.out.println("The Multiplication Of " +a+ " "+b+ " : " + (b*a));
    }
}
class Division extends Arithmetic
{
    public void arithmetic()
    {
        System.out.println("The division Of " +a+ " by "+b+ " : " + (a/b));
    }
}
public class AbstractClassEx2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Addition ad=new Addition();
        ad.arithmetic();
        Subtraction su1=new Subtraction();
        su1.arithmetic();
        Multiplication mu=new Multiplication();
        mu.arithmetic();
        Division di=new Division();
        di.arithmetic();

    }

}
