package threadsExamples;
class ThreadP extends Thread{
    public void run() {
        System.out.println("Thread 1 running");
    }
}
public class ThreadsUsingPriorotyEx {

	public static void main(String[] args) {
		  ThreadP tp=new ThreadP();
	        System.out.println("thread Name:"+tp.getName());
	        System.out.println("thread Pririoty : "+tp.getPriority());//if we doesn't set priority then by default the thread priority is noram Priority(5)
	        ThreadP tp1=new ThreadP();
	        tp1.setName("Thread prority");
	        tp1.setPriority(9);
	        System.out.println("thread Name:"+tp1.getName());
	        System.out.println("thread Pririoty : "+tp1.getPriority());
	        ThreadP tp2=new ThreadP();
	        tp2.setPriority(Thread.NORM_PRIORITY );//default normal priority is 5
	        System.out.println("thread Pririoty : "+tp2.getPriority());
	        tp2.setPriority(Thread.MAX_PRIORITY);// max priority is 10
	        System.out.println("thread Pririoty : "+tp2.getPriority());
	        tp2.setPriority(Thread.MIN_PRIORITY );//min priority is 1
	        System.out.println("thread Pririoty : "+tp2.getPriority());

	}

}
