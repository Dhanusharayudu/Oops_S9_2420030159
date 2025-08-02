package classes;

public class BoxingExample {

	public static void main(String[] args) {
				int num = 10;

     
        Integer boxedNum = Integer.valueOf(num); 
        Integer autoBoxedNum = num; 

        System.out.println("Primitive int: " + num);
        System.out.println("Boxed Integer: " + boxedNum);
        System.out.println("Autoboxed Integer: " + autoBoxedNum);

      
        int unboxedNum = boxedNum.intValue(); 
        int autoUnboxedNum = boxedNum; 

        System.out.println("Unboxed int: " + unboxedNum);
        System.out.println("Auto-unboxed int: " + autoUnboxedNum);
    }


	}  
