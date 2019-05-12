package day06;

import day05.Orang;

public class Staff extends Orang {
	public String nik;
	public String jabatan;
	public String fakultas;
	public String departemen;
	public int gaji;
	//Aggregation
	public Orang atasan;
	
	public void cetakData () {
		super.cetakData();
		System.out.println("NIK \t\t: " + nik);
		System.out.println("Jabatan \t: " + jabatan);
		System.out.println("Fakultas \t: " + fakultas);
		System.out.println("Departemen \t: " + departemen);
		System.out.println("Gaji \t\t: " + gaji);
		System.out.println("Atasan \t\t: " + atasan.nama);
		System.out.println();
	}

}
