package classes;

import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read string value
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Print string on console
        System.out.println("You entered: " + str);

        sc.close();
    }
}