package day01;

public class BreakExample5 {
	public static void main(String[] args) {
		// declaring variable
		int i = 1;
		// do-while loop
		do {
			if (i == 5) {
				// using break statement
				i++;
				break; // it will break the loop
			}
			System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
