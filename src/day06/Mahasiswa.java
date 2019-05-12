package day06;

//Karena Class Orang beda package maka digunakan import 
import day05.Orang;

//extends --> mahasiswa sekarang mewarisi property Orang 
public class Mahasiswa extends Orang {
	public String nim;
	public String fakultas;
	public String departemen;
	public String angkatan;
	public double ipk;
	
	public void cetakData () {
		super.cetakData();
		System.out.println("NIM \t\t: " + nim);
		System.out.println("Fakultas \t: " + fakultas);
		System.out.println("Departemen \t: " + departemen);
		System.out.println("Angkatan \t: " + angkatan);
		System.out.println("IPK \t\t: " + ipk);
		System.out.println();
	}
	

}
