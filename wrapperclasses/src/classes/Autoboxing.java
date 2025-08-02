package classes;

public class Autoboxing {

	public static void main(String[] args) {
		 byte b = 10;
	        short s = 100;
	        int i = 1000;
	        long l = 10000L;
	        float f = 3.14f;
	        double d = 99.99;
	        char c = 'A';
	        boolean bool = true;
	        
	        Byte boxedByte = b;
	        Short boxedShort = s;
	        Integer boxedInt = i;
	        Long boxedLong = l;
	        Float boxedFloat = f;
	        Double boxedDouble = d;
	        Character boxedChar = c;
	        Boolean boxedBoolean = bool;

	        System.out.println("=== Auto-boxing Example ===");
	        System.out.println("Byte object: " + boxedByte);
	        System.out.println("Short object: " + boxedShort);
	        System.out.println("Integer object: " + boxedInt);
	        System.out.println("Long object: " + boxedLong);
	        System.out.println("Float object: " + boxedFloat);
	        System.out.println("Double object: " + boxedDouble);
	        System.out.println("Character object: " + boxedChar);
	        System.out.println("Boolean object: " + boxedBoolean);
	    }

	}
