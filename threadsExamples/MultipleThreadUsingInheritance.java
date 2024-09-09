package threadsExamples;
class Thread2 extends Thread
{
	/* What is the problem with synchronization in Java?
The JVM uses the object itself as a monitor (its intrinsic lock)
 when a class implements method synchronization or block synchronization
  with the this keyword*/
	public void run() {
		display();
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
			System.out.println("Even number : : "+i);
			}
			else
			{
		    System.out.println("Odd number : : "+i);
			}
		}
	}
	public void display()
	{
		System.out.println("Display Thread ");
	}
}
class Thread3 extends Thread
{
	public void run() {
	   int tab=7;
		for(int i=1;i<10;i++)
		{
			
			System.out.println(tab+ " * " +i+ " = " +tab*i );
			
		}
}
}
public class MultipleThreadUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t1=new Thread2();
		t1.start();
		Thread3 t2=new Thread3();
		t2.start();

	}

}
