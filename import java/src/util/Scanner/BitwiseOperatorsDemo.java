package util.Scanner;

public class BitwiseOperatorsDemo {

	public static void main(String[] args) {
		int a = 5;  
        int b = 3; 

        System.out.println("a = " + a + ", b = " + b);

        int andResult = a & b; 
        System.out.println("a & b = " + andResult);

        int orResult = a | b;  
        System.out.println("a | b = " + orResult);


        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult);

        int complementA = ~a;   
        System.out.println("~a = " + complementA);

        int complementB = ~b;   
        System.out.println("~b = " + complementB);
    }

	}
