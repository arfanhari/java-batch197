package day06;

import day05.Orang;

public class MainOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa mhs = new Mahasiswa();
		mhs.id = 1;
		mhs.nama = "Arfan A.";
		mhs.alamat = "Bogor";
		mhs.jenisKelamin = "Laki-laki";
		mhs.noTelepon = "081234567890";
		mhs.nim = "G64130059";
		mhs.fakultas = "MIPA";
		mhs.departemen = "Ilmu Komedi"; 
		mhs.angkatan = "darat";
		mhs.ipk = 4.00;
		mhs.cetakData();
		
		Dosen dsn = new Dosen();
		//Bagaimana cara membuat id unik untuk masing" orang?
		dsn.id = 1;
		dsn.nama = "A. Roni P.";
		dsn.alamat = "Lampung";
		dsn.jenisKelamin = "Laki-laki";
		dsn.noTelepon = "080987654321";
		dsn.nik = "000412341234";
		dsn.fakultas = "MIPA";
		dsn.departemen = "Ilmu Komputer";
		dsn.spesialis = "Problem Solving";
		dsn.jabatan = "Dekan";
		dsn.gaji = 999999999;
		dsn.cetakData();
		
		Staff stf = new Staff();
		stf.id = 1;
		stf.nama = "Juminah";
		stf.alamat = "Sidoarjo";
		stf.jenisKelamin = "Perempuan";
		stf.noTelepon = "081231231231";
		stf.nik = "OB000765";
		stf.jabatan = "Office Boy";
		stf.fakultas = "MIPA";
		stf.departemen = "Biologi";
		stf.gaji = 4000000;
		Orang org01 = new Orang(4,"Bento","Jakarta","Laki-laki","089111888999");
		stf.atasan = org01;
		stf.cetakData();


	}

}
