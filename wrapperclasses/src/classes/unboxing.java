package classes;

public class unboxing {

	public static void main(String[] args) {
		
		
		Byte boxedByte = Byte.valueOf((byte) 10);
        Short boxedShort = Short.valueOf((short) 100);
        Integer boxedInt = Integer.valueOf(1000);
        Long boxedLong = Long.valueOf(10000L);
        Float boxedFloat = Float.valueOf(3.14f);
        Double boxedDouble = Double.valueOf(99.99);
        Character boxedChar = Character.valueOf('A');
        Boolean boxedBoolean = Boolean.valueOf(true);

        byte b = boxedByte.byteValue();
        short s = boxedShort.shortValue();
        int i = boxedInt.intValue();
        long l = boxedLong.longValue();
        float f = boxedFloat.floatValue();
        double d = boxedDouble.doubleValue();
        char c = boxedChar.charValue();
        boolean bool = boxedBoolean.booleanValue();

        int autoInt = boxedInt;
        double autoDouble = boxedDouble;
        
        System.out.println("=== Unboxing Example ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("Auto-unboxed int: " + autoInt);
        System.out.println("Auto-unboxed double: " + autoDouble);
    }

	}

