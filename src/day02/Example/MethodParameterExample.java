package day02.Example;

public class MethodParameterExample {
	public static void main(String[] args) {
		int a = 30;
		int b = 45;
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		// invoke the swap method
		swapFunction(a, b);
		System.out.println("\n**Now, Before and After swapping values will be same here**:");
		System.out.println("After swapping, a = " + a + " b = " + b);

	}

	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping(Inside), a = " + a + " b =" + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping(Inside), a = " + a + " b = " + b);
	}
}
