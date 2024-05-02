package loopingStatementsExamples;
import java.util.Scanner;
public class EvenFactFibonocciEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Operation to be performed 1.Factorial, 2.Print even numbers,"
        		+ " 3.Print Fibonocci: ");
        int number = sc.nextInt();
        
        switch (number)
        {
        case 1:
        	System.out.println("Enter the number upto which you want even numbers : ");
    		int num = sc.nextInt();
    		for(int i=0;i<=num;i++) 
    		{
    			if(i%2==0) {
    			System.out.println("number : "+i);
    			}
    		}
       	  break;
        case 2:
        	System.out.println("Enter the number to check for factorial: ");
    		int no2 = sc.nextInt();
    		int product=1;
    		int fact = 1;
            int i = 1;
            while(i<=no2)
            {
                fact = fact * i;
                i++;
            }
    		System.out.println("Factorial of " +no2+ " is : "+fact );
      	  break;
        case 3:
        	System.out.println("Enter the number upto which fiboconacci series is printed : ");
            int number2 = sc.nextInt();
	        
	        int num1 = 0, num2 = 1, num3;
	        if(number2==1)
	        {
	        	System.out.println(num1);
	        }
	        if(number2==2)
	        {
	        	System.out.print(num1 + " " + num2+" ");
	        }
	        if(number2>2)
	        {
	        System.out.print(num1 + " " + num2+" ");
	        for (int k = 2; k < number2; k++) 
	        {
	            num3 = num1 + num2;
	            System.out.print(num3 + " ");
	            num1 = num2;
	            num2 = num3;
	        }
	        }
      	  break;
        
        default:
            System.out.println("Enter the numbers 1 or 2 or 3");
        }
        
		

	}

}
