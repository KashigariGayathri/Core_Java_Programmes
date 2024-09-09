package threadsExamples;

class ThreadOne implements Runnable {

	@Override
	public void run() {
		//when we use Runnable interface We must override the run() method if not we will get error
		int tab = 7;
		for (int i = 1; i < 10; i++) {

			System.out.println(tab + " * " + i + " = " + tab * i);

		}
	}

}

public class ThreadUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadOne tone = new ThreadOne();//we cant start directly tone.start() because start() ,method is in the Thread class and not in the Runnable Interface
		//tone.run();// to get the output we can use this but to start the thread first we have to create object for the thread class and the normal class object is passed to the thread class object 
		Thread t1 = new Thread(tone);
		t1.start();
	}

}
