package threadsExamples;
class Threads11 extends Thread{
    public void run() {
        System.out.println("Threass111345");
    }
}
public class MultipleStartInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads11 t1=new Threads11();
        t1.start();
        t1.start();
        t1.start();
        // it will provide an exception beacuse multiple times we cant call the start() method
	}

}
