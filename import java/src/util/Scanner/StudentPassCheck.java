package util.Scanner;

import java.util.Scanner;

public class StudentPassCheck {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Theory Exam Marks (out of 100): ");
        int theoryMarks = scanner.nextInt();

        System.out.print("Enter Practical Exam Marks (out of 100): ");
        int practicalMarks = scanner.nextInt();

        if (theoryMarks >= 35 && practicalMarks >= 35) {
            System.out.println("Student passed both Theory and Practical exams.");
        } else {
            System.out.println("Student failed in one or both exams.");
        }

        scanner.close();
    }
}
