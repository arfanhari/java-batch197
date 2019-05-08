package day02.Example;

public class MethodCallExample {
	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		//calling method minFunction
		int c = minFunction(a, b);
		System.out.println("Minimum Value = " + c);
		voidMethod();

	}
	//method return value and with parameter
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}
	//method no return value and no parameter
	public static void voidMethod() {
		System.out.println("This is a void method in java");
		System.out.println("This method not return a value");
		System.out.println("Method is called");
	}
}
