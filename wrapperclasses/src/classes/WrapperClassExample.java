package classes;

public class WrapperClassExample {
	public static void main(String[] args) {
		 byte b = 10;
	        short s = 100;
	        int i = 1000;
	        long l = 10000L;
	        float f = 3.14f;
	        double d = 99.99;
	        char c = 'A';
	        boolean bool = true;

	        Byte boxedByte = Byte.valueOf(b);
	        Short boxedShort = Short.valueOf(s);
	        Integer boxedInt = Integer.valueOf(i);
	        Long boxedLong = Long.valueOf(l);
	        Float boxedFloat = Float.valueOf(f);
	        Double boxedDouble = Double.valueOf(d);
	        Character boxedChar = Character.valueOf(c);
	        Boolean boxedBoolean = Boolean.valueOf(bool);

	        Integer autoBoxedInt = i;
	        Double autoBoxedDouble = d;

	        System.out.println("=== Boxing Example ===");
	        System.out.println("Byte: " + boxedByte);
	        System.out.println("Short: " + boxedShort);
	        System.out.println("Integer: " + boxedInt);
	        System.out.println("Long: " + boxedLong);
	        System.out.println("Float: " + boxedFloat);
	        System.out.println("Double: " + boxedDouble);
	        System.out.println("Character: " + boxedChar);
	        System.out.println("Boolean: " + boxedBoolean);
	        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
	        System.out.println("Auto-boxed Double: " + autoBoxedDouble);

	        // Unboxing (wrapper object → primitive)
	        byte unboxedByte = boxedByte.byteValue();
	        short unboxedShort = boxedShort.shortValue();
	        int unboxedInt = boxedInt.intValue();
	        long unboxedLong = boxedLong.longValue();
	        float unboxedFloat = boxedFloat.floatValue();
	        double unboxedDouble = boxedDouble.doubleValue();
	        char unboxedChar = boxedChar.charValue();
	        boolean unboxedBoolean = boxedBoolean.booleanValue();

	        int autoUnboxedInt = boxedInt;
	        double autoUnboxedDouble = boxedDouble;
	        
	        System.out.println("\n=== Unboxing Example ===");
	        System.out.println("byte: " + unboxedByte);
	        System.out.println("short: " + unboxedShort);
	        System.out.println("int: " + unboxedInt);
	        System.out.println("long: " + unboxedLong);
	        System.out.println("float: " + unboxedFloat);
	        System.out.println("double: " + unboxedDouble);
	        System.out.println("char: " + unboxedChar);
	        System.out.println("boolean: " + unboxedBoolean);
	        System.out.println("Auto-unboxed int: " + autoUnboxedInt);
	        System.out.println("Auto-unboxed double: " + autoUnboxedDouble);
	    }
	}

