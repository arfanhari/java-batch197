package day05;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);

	}

	public static void insertionSort(int[] A) {
		/*
		 * i dimulai dari 1 karena kita akan memerika terlebih dahulu, lebih besar mana
		 * antara A[1] dan A[0]
		 */
		for (int i = 1; i < A.length; i++) {
			// simpan A[indeks] untuk perbandingan nanti
			int value = A[i];
			int j = i - 1;
			/*
			 * Selama j >= 0 && A[j] > value (yang mana merupakan) A[i] ini digunakan
			 * sebagai pengecekan antara array berikutnya dengan masing" dari nilai array
			 * sebelumnya
			 */
			while (j >= 0 && A[j] > value) {
				/*
				 * geser value A[j] menjadi A[j-1] Contoh: A[0] = 9 dan A[1] = 7 maka berikan
				 * value A[0] kepada A[1]
				 */
				A[j + 1] = A[j];
				// decrement digunakan untuk keluar dari fungsi while
				j = j - 1;
			}
			/*
			 * Apabila kemudian fungsi while berjalan maka A[j + 1] = value;
			 * akan memberikan value tersebut pada A[j+1]
			 * Contoh : seperti yg kita ketahui pada fungsi while diatas 
			 * bahwa A[0] = 9 dan A[1] = 7 akan menyebabkan A[1]=9 namun belum mengganti A[0] menjadi 7
			 * maka dari itu value diberikan pada A[0] sehingga A[0] = 7.
			 * 
			 * Kita ketahui bahwa value merupakan isi dari A[i] maka jika array dari indeks
			 * sebelumnya tidak lebih besar dari indeks saat ini kita akan menetapkan posisi
			 * indeks tersebut (kondisi fungsi while tidak terpenuhi). Contoh : misal (A[i]) --> A[2] = 8, value = 8, j = 1.
			 * nilai tersebut tidak akan masuk pada fungsi while karena A[1] < A[2]
			 * sehingga kita menetapkan bahwa (A[j+1]) --> A[2] = 8.
			 * 
			 */
			A[j + 1] = value;
		}

		printArray(A);
	}

	static void printArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}// Class
