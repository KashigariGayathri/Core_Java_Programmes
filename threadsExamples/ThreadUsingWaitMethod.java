package threadsExamples;

class ThreadWait extends Thread {
    int sum = 0;

    public void run() {
        synchronized(this) {
            // Calculate the sum of first 10 natural numbers
            for(int i = 1; i <= 10; i++) {
                sum += i;
            }
            // Notify the main thread that calculation is done
            this.notify();
        }
    }
}

public class ThreadUsingWaitMethod {
    public static void main(String[] args) throws Exception {
        ThreadWait t = new ThreadWait();
        t.start();

        synchronized(t) {
            // Main thread waits for the notification from child thread
            t.wait();
            // Main thread gets notification and proceeds to print the sum
            System.out.println(t.sum);
        }
    }
}
