package day03.Example;

public class ArrayExample3 {
	// creating a method which receives an array as a parameter
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (min > arr[1])
				min = arr[i];

		System.out.println(min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 33, 3, 4, 5 }; // declaring and initializing an array
		min(a); // passing array to method

	}// main
}
