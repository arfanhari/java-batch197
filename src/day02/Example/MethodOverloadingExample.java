package day02.Example;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		// calling method add
		System.out.println(add(11, 11));
		// calling method add
		System.out.println(add(11, 11, 11));

	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
