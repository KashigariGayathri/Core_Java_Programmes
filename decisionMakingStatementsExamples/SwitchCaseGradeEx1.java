package decisionMakingStatementsExamples;

public class SwitchCaseGradeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=70;
        if(score < 0 || score > 100)
             System.out.println("Invalid score");  
         //int score=40;
          switch(score/10) {
            
            case 10:
            case 9:
                 System.out.println("A");
               //System.out.print("A grade");
            // for >= 80 and <90
            case 8:
                System.out.println("A+");
                break;
               
           
            case 7:
                System.out.println("A");
                break;
            
            case 6:
                System.out.println("B+");
                break;
            
            case 5:
                System.out.println("B");
                break;
            
            default:
                System.out.println("Fail");
	}
	}

}
