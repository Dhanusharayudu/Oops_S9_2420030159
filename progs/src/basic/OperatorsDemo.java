package basic;

public class OperatorsDemo {
	    public static void main(String[] args) {
	        int a = 10, b = 3;

	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));

	        System.out.println("\nUnary Operators:");
	        int x = 5;
	        System.out.println("x = " + x);
	        System.out.println("x++ = " + (x++));
	        System.out.println("After x++: x = " + x);
	        System.out.println("++x = " + (++x)); 
	        System.out.println("x-- = " + (x--)); 
	        System.out.println("After x--: x = " + x);
	        System.out.println("--x = " + (--x)); 

	        System.out.println("\nTernary Operator:");
	        int max = (a > b) ? a : b;
	        System.out.println("Max of a and b is: " + max);

	        // Relational Operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a != b: " + (a != b));
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));
	    }
	}

