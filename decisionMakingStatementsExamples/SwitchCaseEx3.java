package decisionMakingStatementsExamples;
import java.util.Scanner;
public class SwitchCaseEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
        int number1, number2, result;
        Scanner input = new Scanner(System.in);
         System.out.println("Choose an operator: +, -, *, or /");
         operator = input.next().charAt(0);
         System.out.println("Operator==>"+operator);
         
         System.out.println("Enter first number : ");
         number1 = input.nextInt();
         System.out.println("Enter second number : ");
         number2 = input.nextInt();
         switch (operator)
         {
         case '+':
        	  result=number1+number2;
        	  System.out.println(number1+ " + " +number2 + " = " + result);
        	  break;
         case '-':
       	  result=number1-number2;
       	  System.out.println(number1+ " - " +number2 + " = " + result);
       	  break;
         case '*':
       	  result=number1*number2;
       	  System.out.println(number1+ " * " +number2 + " = " + result);
       	  break;
         case '/':
       	  result=number1/number2;
       	  System.out.println(number1+ " / " +number2 + " = " + result);
       	  break;
         default:
             System.out.println("Enter the correct Operator");
         }
input.close();
	}

}
