package day02.Example;

public class MethodOverLoadingExample2 {
	public static void main(String[] args) {
		System.out.println(add(11, 11));
		System.out.println(add(12.3, 12.6));

	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
}
