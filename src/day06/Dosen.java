package day06;

import day05.Orang;

public class Dosen extends Orang {
	public String nik;
	public String fakultas;
	public String departemen;
	public String spesialis;
	public String jabatan;
	public int gaji;
	
	public void cetakData () {
		super.cetakData();
		System.out.println("NIK \t\t: " + nik);
		System.out.println("Fakultas \t: " + fakultas);
		System.out.println("Departemen \t: " + departemen);
		System.out.println("Spesialis \t: " + spesialis);
		System.out.println("Jabatan \t: " + jabatan);
		System.out.println("Gaji \t\t: " + gaji);
		System.out.println();
	}
	
}
