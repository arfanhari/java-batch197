package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal07 {
	public static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input kalimat : ");
		String kalimat = scanner.nextLine();

		// proses pemisahan string
		String[] tempArray = kalimat.split("");

		//loop dimulai dari array indeks terakhir karena kita akan membalik huruf pada kata
		for (int i = 0; i < tempArray.length; i++) {
			//Cetak bintang depan
			for (int a = 0; a < (tempArray.length / 2); a++) {
				System.out.print("*");
			}
			
			//cetak huruf paling belakang kata
			System.out.print(tempArray[i]);
			
			//cetak bintang belakang
			for (int a = 0; a < (tempArray.length / 2); a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}