package util;

public class CompoundAssignmentDemo {

	public static void main(String[] args) {
		 int num = 20;

	        System.out.println("Initial value: " + num);

	        num += 10;  
	        System.out.println("After += 5: " + num);

	        num -= 5;  
	        System.out.println("After -= 3: " + num);

	        num *= 6; 
	        System.out.println("After *= 2: " + num);

	        num /= 3;  
	        System.out.println("After /= 4: " + num);

	        num %= 4;  
	        System.out.println("After %= 3: " + num);
	    }
	}
