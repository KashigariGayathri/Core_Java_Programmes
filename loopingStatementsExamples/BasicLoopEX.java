package loopingStatementsExamples;

public class BasicLoopEX {

	public static void main(String[] args) {
		int i=0;
		System.out.println("While Loop Increment");
		while(i<5)
			{
			System.out.println("The value is : "+i);
			i++;
			}
		System.out.println("For Loop Increment");
		for(int j=0;j<5;j++)
		{
			System.out.println("the value is : "+j);
		}
		int num = 0;
		System.out.println("Do While Loop Increment");
		do
		{
			
			System.out.println("The value is : "+num);
			num++;
		}while(num<5);
		
		
		
		System.out.println("While Loop Decrement");
		int i2=5;
		while(i2>0)
			{
			System.out.println("The value is : "+i2);
			i2--;
			}
		System.out.println("For Loop Decrement");
		for(int j=5;j>0;j--)
		{
			System.out.println("the value is : "+j);
		}
		int num1 = 5;
		System.out.println("Do While Loop Increment");
		do
		{
			
			System.out.println("The value is : "+num1);
			num1++;
			}while(num1<5);
	}

}
