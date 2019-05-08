package day02;

import java.util.Scanner;

public class Soal03 {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);

		System.out.print("Input Your Number N1, N2 & N3 = ");

		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		int temp = 3;

		int[] deret = new int[n1];

		// Print N1
		for (int k = 1; k <= n1; k++) {
			System.out.print(k + "\t");
		}

		// Print deret baris ke-2
		System.out.println();
		for (int i = 0; i < n1; i++) {
			deret[i] = temp;
			// setengah panjang array
			if (i < n1 / 2) {
				temp = temp * n3;
			} else {
				temp = temp / n3;
			}

			System.out.print(deret[i] + "\t");
		}

		System.out.print("\nPerhitungan => \t" + deret[n1/2]);

		int hasil = deret[n1 / 2];

		for (int i = (n1 / 2) + 1; i < ((n1 / 2) + n2); i++) {
			System.out.print(" - " + deret[i]);
			hasil -= deret[i];
		}

		System.out.println(" = " + hasil);
	}

}
