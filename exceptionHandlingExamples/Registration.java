package exceptionHandlingExamples;

import java.util.Scanner;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

class Classroom {
	public String registerStudent(Student student) {
		if (student == null) {
			return "Student object is null";
		}
		if (!(student.name.matches(".*[A-Z].*"))) {
			return "Block letters needed";
		}
		if (student.score < 0 || student.score > 100) {
			return "Invalid score";
		}
		return "Registered";
	}

	public String studentCard(String card) {
		if (card.matches("\\d+")) {
			return "valid card";
		}
		return "Invalid card";
	}
}

public class Registration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom ce = new Classroom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and score :");
		String name = sc.nextLine();
		int score = sc.nextInt();
		Student s1 = new Student(name, score);

		System.out.println(ce.registerStudent(s1));

		sc.close();
	}
}
