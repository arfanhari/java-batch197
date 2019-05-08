package day03;

import java.util.Scanner;

public class Logika03Soal02 {

	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);

		System.out.print("Input Your Number N : ");
		int n = input.nextInt();
		System.out.print("Input Your Number M : ");
		int m = input.nextInt();
		System.out.print("Input Your Number O : ");
		int o = input.nextInt();

		// deklarasi array matriks untuk nantinya dipakai pada array[6][i] && array
		// [i][6]
		int arr[][] = new int[n][n];

		int[] array = deretAngka(n * 4, m, o);
		int indeks = 0;

		// [i][n - 1] --> matriks baris ke i kolom terakhir
		for (int i = 1; i < n; i++) {
			arr[i][n - 1] = array[indeks+n];
			indeks++;
		}

		// [n-1][i] --> matriks baris terakhir kolom ke i
		for (int i = n - 2; i >= 0; i--) {
			arr[n - 1][i] = array[indeks+n];
			indeks++;
		}
		
		// Cetak Array dalam bentuk matriks
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i+j == n-1) {
					arr[i][j] = array[j];
				}
				System.out.print(arr[i][j] + "\t");
			} 
			System.out.println("\n");
		}
		

	}// main method

	// method untuk membuat deret
	static int[] deretAngka(int n, int m, int o) {
		int arr[] = new int[n];
		// sebagai nilai awalan deretAngka[0]
		int angka = o;
		int temp = m;
		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				arr[i] = temp;
				temp = temp * m;
				
			} else {
				arr[i] = angka;
				angka += m;
			}
		}
		return arr;
	}

} // class
