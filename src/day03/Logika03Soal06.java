package day03;

import java.util.Scanner;

public class Logika03Soal06 {
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Masukkan N :");
		int n = input.nextInt();
		System.out.println("Masukkan M : ");
		int m = input.nextInt();

		deretAngka(n);
		int array[] = deretAngka(n);
		int array2[] = deretAngka(n);
		
		//buat baris
		for (int i = 0; i <= m; i++) {
			//print array
			for (int j = 0; j < n; j++) {
				System.out.print(array[j] + "\t");
			}
			System.out.println();
			
			//
			for (int k = n - 1; k >= 0; k--) {
				if (k == n - 1) {
					//pindahkan array2 pertama ke indeks terakhir array1
					array[k] = array2[0];
				} else {
					//else pindahin array 2 indeks ke ke 2 dari belakang ke indeks k saat itu
					array[k] = array2[k + 1];
				}
			}
			//Copy Array --> Array2 untuk nanti digunakan sebagai pengurut m berikutnya
			for (int l = 0; l < n; l++) {
				array2[l] = array[l];
			}

		}

	}

	static int[] deretAngka(int n) {
		int result[] = new int[n];
		int awal = 2;
		int tambah = 2;
		//bikin deret perubah suku
		for (int i = 0; i < n; i++) {
			result[i] = awal;
			awal = awal + tambah;
			tambah += 2;

		}

		return result;
	}

}