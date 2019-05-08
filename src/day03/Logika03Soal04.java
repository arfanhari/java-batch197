package day03;

import java.util.Scanner;

public class Logika03Soal04 {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		
		System.out.print("Input your number N = ");
		int n = input.nextInt();
		System.out.print("Input your number M = ");
		int m = input.nextInt();

		int deret1[] = deretAngka(n);
		int deret2[] = deretAngka(n);

		// banyak baris
		for (int i = 0; i <= m; i++) {
			// cetak array
			for (int j = 0; j < n; j++) {
				System.out.print(deret1[j] + "\t");
			}
			System.out.println();

			for (int k = 0; k < n; k++) {
				// buat array baru dengan isi array indeks pertama menjadi isi array indeks
				// terakhir
				if (k == 0) {
					deret1[k] = deret2[n - 1];
				} else {
					deret1[k] = deret2[k - 1];
				}

			}

			// Karena yang dicetak adalah deret1 dan deret 2 masih diperlukan
			// untuk perpindahan deret1[n-1]
			// pada looping untuk k=0 ketika m>1 (check melalui debug)
			for (int l = 0; l < n; l++) {
				deret2[l] = deret1[l];
				
			}

		}

	}

	static int[] deretAngka(int n) {
		int hasil[] = new int[n];
		int awal = 1;
		int tambah = 2;

		for (int i = 0; i < n; i++) {
			hasil[i] = awal;
			awal = awal + tambah;
			tambah++;
			// System.out.print(hasil[i] + "\t");
		}

		return hasil;
	}
}// Class
