package doselectExProgrammes;
import java.util.Scanner;

public class MonkeyJump1 {
	 public int calculateTotalJump(int a[], int index)
	    {
	        int totalJump = 0;
	        int sequence = a[index]; 

	        for (int i = 0; i < sequence; i++)
	        {
	            if (i % 3 == 0) 
	            {
	                totalJump =  totalJump + 20; 
	            } 
	            else if (i % 3 == 1)
	            {
	                totalJump = totalJump + 10;
	            } 
	            else 
	            {
	                totalJump  = totalJump + 5;  
	            }
	        }

	        return totalJump;
	    }
	  public void printJumpDistances(int[] sequences) {
	        for (int i = 0; i < sequences.length; i++) {
	            int totalJump = calculateTotalJump(sequences, i);
	            System.out.println(  totalJump );
	        }
	    }
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
        
        int a[] = new int [4];
        //System.out.println("Enter value");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        
        MonkeyJump1 monkeyJump = new MonkeyJump1();
        monkeyJump.printJumpDistances(a); 
	}

}
