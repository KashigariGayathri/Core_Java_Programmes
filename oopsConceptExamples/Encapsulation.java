package oopsConceptExamples;
class BankAcc {
	private int bAccNo;
	private String bName;
	private int bBalance;

	public int getbAccNo() {
		return bAccNo;
	}

	public void setbAccNo(int bAccNo) {
		this.bAccNo = bAccNo;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getbBalance() {
		return bBalance;
	}

	public void setbBalance(int bBalance) {
		this.bBalance = bBalance;
	}
	void deposit(int amount) {
		if(amount>0) {
			bBalance=amount+bBalance;
			System.out.println(amount+"  Deposit Done  "+"\nCurrent Balance is : "+bBalance);
		}
	}
	void withdraw(int amount) {
		if(bBalance>0 && bBalance>=amount) {
			bBalance=bBalance-amount;
			System.out.println(amount+"  Withdrawal Done  "+"\nCurrent Balance is : "+bBalance);	
		}
		else {
			System.out.println("Insuffient Balance");
		}
	}
}


public class Encapsulation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc b = new BankAcc();
		b.setbAccNo(101234);
		b.setbName("SBI");
		b.setbBalance(50000);
		System.out.println(b.getbAccNo() + ":" + b.getbName() + ":" + b.getbBalance());
        b.deposit(5000);
        b.withdraw(1500);


	}

}
