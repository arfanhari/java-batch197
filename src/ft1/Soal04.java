package ft1;

import java.util.Scanner;

public class Soal04 {
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Input kalimat : ");

		input = new Scanner(System.in);

		String kalimat = input.nextLine();

		StringBuilder ubahKalimat = new StringBuilder();

		// pecah kalimat menjadi kata
		for (String word : kalimat.split(" ")) {
			// masukan kata per method replaceAll
			ubahKalimat.append(replaceAll(word, '*'));
			ubahKalimat.append(" ");
		}

		System.out.println(ubahKalimat);
	}// main

	public static String replaceAll(String word, char replacer) {

		// StringBuilder adalah class yang digunakan untuk membuat objeck string dimana
		// obj string ini dapat dimodifikasi
		// .append digunakan untuk menambahkan string ke obj StringBuilder
		StringBuilder ret = new StringBuilder();
		// karena huruf diganti hanya bila huruf lebih dari 2
		if (word.length() > 2) {
			// Huruf pertama tetap
			ret.append(word.charAt(0));
			
			  //Ganti isi Kata 
			  for (int i = 1; i < word.length() - 1; i++) {
			  ret.append(replacer); }
			 

//			for (int i = 0; i < 3; i++) {
//				ret.append(replacer);
//			}

			// Huruf terakhir kata tetap
			ret.append(word.charAt(word.length() - 1));
			return ret.toString();
		}

		return word;
	}// End Method ReplaceAll
	
}// Class