package day03;

import java.util.Scanner;

public class Logika03Soal01 {

	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);

		System.out.print("Input your number N1 = ");

		int n1 = input.nextInt();
		int[] deretSatu = new int[n1];
		int awal1 = 1;

		// Membuat deretSatu
		for (int i = 0; i < deretSatu.length; i++) {
			deretSatu[i] = awal1;
			awal1 = awal1 + (i + 2);
			// Check nilai deretSatu
			// System.out.print(deretSatu[i] + " ");
		}

		// Membuat deretDua
		int[] deretDua = new int[n1];
		int awal2 = 2;

		for (int i = 0; i < deretDua.length; i++) {
			deretDua[i] = awal2;
			awal2 = awal2 + (2 * (i + 1));
			// Check nilai deretDua
			// System.out.print(deretDua[i] + " ");
		}

		int matrix[][] = new int[n1][n1];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				if (i == j) {
					matrix[i][j] = deretSatu[i];
				} else if (i + j == n1 - 1) {
					matrix[i][j] = deretDua[j];
				}
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();

		}

	}// Main

}// Class

/*
 * int n1 = input.nextInt(); int matrixX[][] = new int[n1][n1]; int firstValue =
 * 1; int additionValue = 2;
 * 
 * for (int i = 0; i < n1; i++) { for (int j = 0; j < n1; j++) { if (i == j) {
 * matrixX[i][j] = firstValue + additionValue; additionValue++;
 * System.out.print(matrixX[i][j]); } else { matrixX[i][j] = 0;
 * System.out.print(matrixX[i][j]); } } System.out.println(); }
 */