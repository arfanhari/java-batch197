package ft1;

import java.util.Scanner;

public class Soal02 {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		input = new Scanner(System.in);
//
//		System.out.printf("Masukan Input : ");
//		String n = input.nextLine();
//
//		String[] arrayString = n.split(" ");
//		int[] arrayInput = new int[arrayString.length];
//
//		for (int i = 0; i < arrayString.length; i++) {
//			arrayInput[i] = Integer.parseInt(arrayString[i]);
//		}

		int n = 9;
		int suku;
		int a = 1, b = 0, result;
		int[] fibo = new int[n];

		// buat deret fibonacci
		for (int i = 0; i < n; i++) {
			result = a + b;
			fibo[i] = result;

			a = b;
			b = result;
		}

		//cetak fibo
		for (int i = 0; i < fibo.length; i++) {
			System.out.print(fibo[i] + " ");
		}

		meleleh(new int[] { 3, 3, 9, 6, 7, 8, 23 }, fibo);

	}// Main Method

	static void meleleh(int[] arr, int[] arrFibo) {
		
		int[] hasil = new int[arr.length];
		// looping meleleh per detik
		for (int i = 0; i < arr.length; i++) {
			// int k = 0;

			// looping meleleh unit
			for (int j = 0; arr[j] <= 0; j++) {
				arr[j] = arr[j] - arrFibo[j];
				//Berhentikan ketika value dari array j 0
				if (arr[j] <= 0) {
					hasil[j] = arr[j];
				}
			}

		}

	}

}
