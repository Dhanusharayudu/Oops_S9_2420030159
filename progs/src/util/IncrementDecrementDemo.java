package util;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		int num = 100;

        System.out.println("Initial value: " + num);

        System.out.println("Post-increment (num++): " + num++);
        System.out.println("After post-increment: " + num);

        System.out.println("Pre-increment (++num): " + ++num);
        System.out.println("After pre-increment: " + num);

        System.out.println("Post-decrement (num--): " + num--);
        System.out.println("After post-decrement: " + num);

        System.out.println("Pre-decrement (--num): " + --num);
        System.out.println("After pre-decrement: " + num);
    }
}

