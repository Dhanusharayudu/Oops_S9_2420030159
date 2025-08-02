package classes;

import java.util.Scanner;
public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] marks = new int[6];
        int total = 0;
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = total / 6.0;
        System.out.println("\n=== Student Marks Report ===");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }

	}