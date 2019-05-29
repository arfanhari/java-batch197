package ft1;

import java.util.Scanner;

public class Soal01 {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input = new Scanner(System.in);
//
//		System.out.printf("Uang Andi : ");
//		int inUang = input.nextInt();
//		
//		System.out.printf("Berapa banyak list harga kacamata : ");
//		int n = input.nextInt();
//		System.out.printf("Berapa masing-masing harga kacamata : ");
//		
//		
//		int[] inKacamata = new int[n];
//		for (int i = 0; i < n; i++) {
//			inKacamata[i] = input.nextInt();
//		}
//		
//		//===========================================================
//		System.out.printf("Berapa banyak list harga baju : ");
//		int m = input.nextInt();
//		System.out.printf("Berapa masing-masing harga baju : ");
//		
//		
//		int[] inBaju = new int[m];
//		for (int i = 0; i < m; i++) {
//			inBaju[i] = input.nextInt();
//		}
//		
//		beliMaksimum(inUang,inKacamata,inBaju);
		
		beliMaksimum(30, new int[] {34, 26, 44}, new int[] {21,39,33});
		
	}

	static void beliMaksimum( int uangAndi, int[] kacamata, int[] baju) { 
		
		int sum = 0;
		
		//cek kacamata ke i
		for (int i = 0; i < kacamata.length; i++) {
			//cek baju ke i
			for (int j = 0; j < baju.length; j++) {
				//jumlahkan kedua biaya
				int cost = kacamata[i] + baju[j];
				//jika uang andi masih mencukupi dan biaya > pengeluaran (sementara)
				if (cost <= uangAndi && cost > sum) {
					//maka simpan biaya sebagai total pengeluaran sementara 
					//untuk next loop
					sum = cost;
				}
			}
		}
		
		if (sum == 0) {
			System.out.println("Dana Tidak Mencukupi");
		} else {
			System.out.println(sum);;
		}
	}// End Method

}
