package classes;

public class StringMethodsExample {

	public static void main(String[] args) {
		String str = "Hello World";
       
        System.out.println("Length of string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'ld': " + str.endsWith("ld"));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

       String str2 = "   Java Programming   ";
        System.out.println("Before trim: '" + str2 + "'");
        System.out.println("After trim: '" + str2.trim() + "'");
    }
}