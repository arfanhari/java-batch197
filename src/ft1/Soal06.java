package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal06 {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 4 7 8 6 91
		// diminta 4 komponen terrendah & tertinggi
		input = new Scanner(System.in);

		System.out.printf("Masukan jumlah komponen yang akan diambil : ");
		int x = input.nextInt();
		
		input = new Scanner(System.in);

		System.out.printf("Masukan Input : ");
		String n = input.nextLine();

		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];

		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}
		
		//int[] arrayInput = new int[] { 2, 4, 5, 6, 7, 8, 9 };
		Arrays.sort(arrayInput);

		miniMaxSum(arrayInput, x);
	}

	static void miniMaxSum(int[] arr, int x) {
		
		long sumMinKeN = 0;
		long sumMaxKeN = 0;
		
		for (int j = 0; j < x; j++) {
			sumMinKeN += arr[j];
			sumMaxKeN += arr[arr.length -1 -j];
		}
		System.out.println(sumMinKeN + " " +sumMaxKeN);

	}// Method

}
