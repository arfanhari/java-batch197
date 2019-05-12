package day05;

import java.util.ArrayList;

public class Orang {

	public int id;
	public String nama;
	public String alamat;
	public String jenisKelamin;
	public String noTelepon;
	
	
	//Batch197 == Tipe data | jumlahInput ==  Objek 
	Batch197 jumlahInput = new Batch197();
	
	/*public int[] listId = new int[jumlahInput.n];
	public String[] listNama = new String[jumlahInput.n];
	public String[] listAlamat = new String[jumlahInput.n];
	public String[] listJenisKelamin = new String[jumlahInput.n];
	public String[] listNoTelepon = new String[jumlahInput.n];
	*/
	
	public ArrayList<Integer> listId = new ArrayList<Integer>();
	public ArrayList<String> listNama = new ArrayList<String>();
	public ArrayList<String> listAlamat = new ArrayList<String>();
	public ArrayList<String> listJenisKelamin = new ArrayList<String>();
	public ArrayList<String> listNoTelepon = new ArrayList<String>();
	
	public Orang() {
		
	}
	
	public Orang(int id, String nama, String alamat, String jenisKelamin, String noTelepon) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.noTelepon = noTelepon;
	}
	
	public void inputData(int id, String nama, String alamat, String jenisKelamin, String noTelepon) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.noTelepon = noTelepon;
	}

	public void cetakData() {
		System.out.println("ID \t\t: " + id);
		System.out.println("Nama \t\t: " + nama);
		System.out.println("Alamat \t\t: " + alamat);
		System.out.println("Jenis Kelamin \t: " + jenisKelamin);
		System.out.println("Nomor Telepon \t: " + noTelepon);
	}// Cetak data
	

}// Class
