package doselectExProgrammes;
import java.util.Scanner;
public class MonkeyJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
        int a[] = new int [4];
        //System.out.println("Enter value");
        for (int i = 0; i < a.length; i++) 
        {
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) 
        {
            int distance =0;
            int jump =20;
            while(a[i] >0) {
                 distance = distance + jump;
                 jump = jump/2;
                 if(jump <5) {
                     jump = 20;
                 }
                 a[i]--;
            }
            System.out.println(distance);
 }
         }
}


