package threadsExamples;
class Thread1 extends Thread
{
	public void run() {
		display();
		for(int i=0;i<5;i++)
		{
			System.out.println("My Thread : "+i);
		}
	}
	public void display()
	{
		System.out.println("Display Thread ");
	}
}
public class ThreadUsingInheritance {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();

	}

}
