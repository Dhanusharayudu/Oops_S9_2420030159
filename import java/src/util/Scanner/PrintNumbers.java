package util.Scanner;

import java.util.Scanner;


public class PrintNumbers {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input N
	        System.out.print("Enter a number (N): ");
	        int N = scanner.nextInt();

	        // Print numbers from 1 to N
	        System.out.println("Numbers from 1 to " + N + ":");
	        for (int i = 1; i <= N; i++) {
	            System.out.print(i + " ");
	        }

	        scanner.close();
	    }

		

	}
