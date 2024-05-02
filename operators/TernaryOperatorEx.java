package operators;

import java.util.Scanner;

public class TernaryOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number : ");
		number=sc.nextInt();
		String display;
		display = (number%2==0) ? "The number is Even" : "The number is odd"; 
		System.out.println(display);
		int a2,b2,c2;
		System.out.println("Enter the value of a2 and b2 and c2 : ");
		a2=sc.nextInt();
		b2=sc.nextInt();
        c2=sc.nextInt();
		
		int max=a2>b2?a2:b2;//condition?true:false
        System.out.println("Max : "+max);
        
        String result=a2>b2?"a2 is greather":"b2 is greater";//condition?true:false
        System.out.println("Max : "+result);
        int max1=(a2>b2)?a2:b2;
        int result2=(c2>max1)?c2:max1;
        System.out.println("the largest number is :"+result2);
        int result3= c2 > (a2 > b2 ? a2 : b2) ? c2 : ((a2 > b2) ? a2 : b2);
        System.out.println("the largest number is :"+result3); 
	}

}
