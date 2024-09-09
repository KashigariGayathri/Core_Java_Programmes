package threadsExamples;
import java.util.Scanner;
class BankAccount {
    private int balance = 0;
    private int availableBalance = 0; // Initialize available balance

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(int amount) {
        synchronized (this) {
            balance += amount;
            availableBalance += amount; // Update available balance
            System.out.println("Deposited: " + amount + ", Current balance: " + balance);
            // Notify waiting threads that balance has been updated
            this.notify();
        }
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " Enter.");
            System.out.println("Available balance: " + availableBalance + ", Requested amount: " + amount);
            if (availableBalance < amount) {
                System.out.println("Requested amount not available :-(");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            } else {
                balance -= amount; // Deduct the withdrawal amount
                availableBalance -= amount; // Update available balance
                System.out.println("Withdrawn: " + amount + ", Current balance: " + balance);
            }
            System.out.println(Thread.currentThread().getName() + " Leaving.");
            System.out.println("....................................................");
        }
        this.notify();
    }
}
class DepositThread extends Thread {
    private final BankAccount account;
    private final int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}
class WithdrawThread extends Thread {
    private final BankAccount account;
    private final int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
public class BankExample {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited:");
        int depositAmount = sc.nextInt();
        System.out.println("Enter the amount to be withdrawn:");
        int withdrawAmount = sc.nextInt();

        DepositThread depositThread = new DepositThread(account, depositAmount);
        WithdrawThread withdrawThread = new WithdrawThread(account, withdrawAmount);
        // Start the threads
        withdrawThread.start();
        Thread.sleep(1000); // Ensure withdrawThread starts first and waits
        depositThread.start();

        synchronized (account) {
            // Main thread waits for the notification from child thread
            account.wait();
            // Main thread gets notification and proceeds

            // Wait for threads to finish
            depositThread.join();
            withdrawThread.join();

            System.out.println("Final balance: " + account.getBalance());
        }
    }
}
