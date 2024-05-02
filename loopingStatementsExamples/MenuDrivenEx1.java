package loopingStatementsExamples;
import java.util.Scanner;
public class MenuDrivenEx1 {

		void printEven(int no) {
			System.out.println("1 to 50 even num");
			for(int i=1;i<=no;i++) {
				if(i%2==0) {
					System.out.println("Even : "+i);
				}
				if(i%2!=0) {
					System.out.println("ODD : "+i);
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuDrivenEx1  e=new MenuDrivenEx1();
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Even odd print");
		System.out.println("2.Exit");
		System.out.println("Enter ur choice");
		ch=sc.nextInt();
		switch (ch) {
		case 1: {
			e.printEven(30);
			break;
			
		}
		case 2:
			System.exit(0);
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}

	}
}

