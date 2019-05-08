package day03;

import java.util.Scanner;

public class Logika03Soal03 {

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
		
		int[] array = deretAngka(n * 4, m, o);
		
		//Cetak deretAngka untuk pengecekan
		//for (int i = 0; i < array.length; i++) {
		//	System.out.print(array[i] + "\t");
		//}
		
		int arr[][] = new int[n][n];
		
		int indeks = 0;
		
		//[0][i]-->  matriks baris pertama pada kolom ke i
		for (int i = 0; i < n; i++) {
			arr[0][i] = array[indeks];
			indeks++;
		}
		//[i][n - 1] -->  matriks baris ke i kolom terakhir
		for (int i = 1; i< n; i++) {
			arr[i][n-1] = array[indeks];
			indeks++;
		}
		
		// [n-1][i] -->matriks baris terakhir kolom ke i
		for (int i = n-2; i>=0; i--) {
			arr[n-1][i] = array[indeks];
			indeks++;
		}
		
		//[i][0] --> matriks baris ke i pada kolom pertama
		for (int i = n-2; i>=1; i--) {
			arr[i][0] = array[indeks];
			indeks++;
		}
		
		
		//Cetak Array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			} System.out.println("\n");
		}
	}//main

	//method untuk membuat deret
	static int[] deretAngka(int n, int m, int o) {
		int arr[] = new int[n];
		// sebagai nilai awalan deretAngka[0]
		int angka = o;

		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				arr[i] = m;
			} else {
				arr[i] = angka;
				angka += m;
			}
		}
		return arr;
	}
}
