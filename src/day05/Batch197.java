package day05;

import java.util.ArrayList;

import java.util.Scanner;

public class Batch197 {

	protected static Scanner input;

	public static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input & cetak data contoh 01
		// Orang == Tipe data orang01 == objek
		/*
		 * Orang orang01 = new Orang();
		 * 
		 * orang01.id = 001; orang01.nama = "Arfan Anhari"; orang01.alamat = "Bogor";
		 * orang01.jenisKelamin = "Pria"; orang01.noTelepon = "089123456789";
		 * 
		 * //Cetak System.out.println("ID \t\t: " + orang01.id);
		 * System.out.println("Nama \t\t: " + orang01.nama);
		 * System.out.println("Alamat \t\t: " + orang01.alamat);
		 * System.out.println("Jenis Kelamin \t: " + orang01.jenisKelamin);
		 * System.out.println("Nomor Telepon \t: " + orang01.noTelepon);
		 * System.out.println();
		 * 
		 * //Input & cetak data contoh 02 Orang orang02 = new Orang();
		 * orang02.inputData(2, "Irman", "Cakung", "Pria", "089987654321");
		 * 
		 * orang02.cetakData();
		 */

		// Input dan cetak data Praktis
		input = new Scanner(System.in);
		System.out.println("\n <=== Contoh Input Seperti Diatas ==>");
		System.out.println("Berapa banyak data yang akan dimasukkan?");
		int jumlahInput = input.nextInt();

		n = jumlahInput;

		Orang org = new Orang();

		for (int i = 0; i < jumlahInput; i++) {
			System.out.println("Berikan input ID ke - " + (i + 1));
			org.listId[i] = input.nextInt();

			System.out.println("Berikan input Nama : ");
			org.listNama[i] = input.next();

			System.out.println("Berikan input Alamat : ");
			org.listAlamat[i] = input.next();

			System.out.println("Berikan input Jenis Kelamin : ");
			org.listJenisKelamin[i] = input.next();

			System.out.println("Berikan input Nomor Telepon : ");
			org.listNoTelepon[i] = input.next();
		}

		for (int j = 0; j < n; j++) {
			System.out.println("\nData pribadi untuk input ke - " + (j + 1));
			System.out.println("ID \t\t: " + org.listId[j]);
			System.out.println("Nama \t\t: " + org.listNama[j]);
			System.out.println("Alamat \t\t: " + org.listAlamat[j]);
			System.out.println("Jenis Kelamin \t: " + org.listJenisKelamin[j]);
			System.out.println("Nomor Telepon \t: " + org.listNoTelepon[j]);
		}

	}// Main

}// Class
