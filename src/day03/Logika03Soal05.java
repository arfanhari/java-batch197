package day03;

import java.util.Scanner;

public class Logika03Soal05 {

	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		
		System.out.print("Input your number N = ");
		int n = input.nextInt();
		
		int[] deretSatu = new int[n*n];
		int awal = 1;

		// Membuat deretSatu
		for (int i = 0; i < deretSatu.length; i++) {
			deretSatu[i] = awal;
			awal = awal+1;
		}
		
		int[][] matrix = new int[n][n];
		int indeks = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = deretSatu[indeks];
				indeks++;
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		
		//Hitung Sum
		int sum = 0, leftDiagonal = 0, rightDiagonal = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//System.out.print(matrix[i][j] + "\t");
				if (i == j) {
					leftDiagonal = leftDiagonal + matrix[i][j];
				}

				if (i + j == matrix.length - 1) {
					rightDiagonal = rightDiagonal + matrix[i][j];
				}
			}
		}
		
		sum = leftDiagonal - rightDiagonal;
		sum = Math.abs(sum);
		System.out.print("\n Hasil selisih dari diagonal tersebut adalah ");
		System.out.println(leftDiagonal + " - "+ rightDiagonal + " = "+ sum);
	}
}
