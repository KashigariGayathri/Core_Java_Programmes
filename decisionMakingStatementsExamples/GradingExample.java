package decisionMakingStatementsExamples;

import java.util.Scanner;

public class GradingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Name : ");
		String s1=sc.nextLine();
		System.out.println("Enter the roll no : ");
		int num=sc.nextInt();
		System.out.println("Enter the 5 subjects marks : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		if (n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0 || n5 <0) {
            System.out.println("Subject should not be nagative");
            return;
        }
		if (n1 > 100 || n2 > 100 || n3 >100 || n4 > 100 || n5 >100) {
            System.out.println("Subject should not greater than Zero");
            return;
        }
		int avg=(n1+n2+n3+n4+n5)/5;
		System.out.println("The student name is : "+s1);
		System.out.println("the student roll number is : " +num);
		if(avg>=90&&avg<=100)
		{
			System.out.println("Your Grade is O ");
		}else if(avg>=80&&avg<90)
		{
			System.out.println("Your Grade is A ");
		}
		else if(avg>=70&&avg<80)
		{
			System.out.println("Your Grade is B ");
		}
		else if(avg>=60&&avg<70)
		{
			System.out.println("Your Grade is C ");
		}
		else if(avg>=50&&avg<60)
		{
			System.out.println("Your Grade is D ");
		}
		else if(avg>=35&&avg<50)
		{
			System.out.println("Your Grade is E ");
		}
		else if(avg<35)
		{
			System.out.println("Your Grade is B ");
		}
		
	}
}
		