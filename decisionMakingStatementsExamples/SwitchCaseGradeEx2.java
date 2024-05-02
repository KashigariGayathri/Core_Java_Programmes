package decisionMakingStatementsExamples;
import java.util.Scanner;
public class SwitchCaseGradeEx2 {
	public static String findGrade(int score) {
        String grade = "";
        if (score < 0 || score > 100)
            System.out.println("Invalid score");
        switch (score / 10) {
        case 10:
        case 9:
            System.out.println("A");
            break;
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
        return grade;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Score");
        int score = sc.nextInt();
        String grade = findGrade(score);
        System.out.println("Grade" + grade);
        sc.close();
	}

}
