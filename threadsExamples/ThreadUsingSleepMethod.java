package threadsExamples;
class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
        	//Thread.sleep() method must kept within the try catch block if not if will provide exception
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("My Thread 1 : " + i);
        }
        }
        }
public class ThreadUsingSleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwo t1=new ThreadTwo();
        //t1.run();
    Thread t=new Thread(t1);
   t.start();
	}

}
