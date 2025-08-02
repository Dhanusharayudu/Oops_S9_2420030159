package util.Scanner;
import java.util.Scanner;


public class AcceptUntilZero {

	private static Scanner scanner;

	public static void main(String[] args) {
		 int number;

	        do {
	            System.out.print("Enter a number (0 to stop): ");
	            number = scanner.nextInt();
	            
	            if (number != 0) {
	                System.out.println("You entered: " + number);
	            }
	        } while (number != 0);

	        System.out.println("Program ended. You entered 0.");
	        scanner.close();
	   

	}

}
