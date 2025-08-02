package classes;

public class AutoUnboxingExample {

	public static void main(String[] args) {
		  Byte boxedByte = 10;    
	        Short boxedShort = 100;
	        Integer boxedInt = 1000;
	        Long boxedLong = 10000L;
	        Float boxedFloat = 3.14f;
	        Double boxedDouble = 99.99;
	        Character boxedChar = 'A';
	        Boolean boxedBoolean = true;

	        byte b = boxedByte;
	        short s = boxedShort;
	        int i = boxedInt;
	        long l = boxedLong;
	        float f = boxedFloat;
	        double d = boxedDouble;
	        char c = boxedChar;
	        boolean bool = boxedBoolean;

	        System.out.println("=== Auto-unboxing Example ===");
	        System.out.println("byte: " + b);
	        System.out.println("short: " + s);
	        System.out.println("int: " + i);
	        System.out.println("long: " + l);
	        System.out.println("float: " + f);
	        System.out.println("double: " + d);
	        System.out.println("char: " + c);
	        System.out.println("boolean: " + bool);
	    }

	}

