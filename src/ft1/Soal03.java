package ft1;

import java.util.Scanner;

public class Soal03 {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);

		System.out.printf("Masukan Input : ");
		String n = input.nextLine();

		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];

		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}

		bubbleSort(arrayInput);

	}// Main

	public static void bubbleSort(int[] arr) {

		int temp = 0;
		
		// Loop iterasi
		for (int i = 0; i < arr.length; i++) {
			// loop pembanding
			for (int j = 0; j < (arr.length - 1); j++) {
				// if arr[before] > arr[after]
				// TRUE maka lanjut
				if (arr[j] < arr[j + 1]) {
					// simpan arr[before] ke temp
					temp = arr[j];
					// berikan nilai arr[after] kepada arr[before]
					arr[j] = arr[j + 1];
					// berikan nilai sementara kepada arr[after]
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}// BubbleSort

}// Class
