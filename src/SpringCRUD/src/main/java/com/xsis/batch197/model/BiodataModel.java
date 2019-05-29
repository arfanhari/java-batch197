package com.xsis.batch197.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "biodata")
public class BiodataModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "biodata_seq")
	@TableGenerator(name = "biodata_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
//	"namaLengkap" digunakan untuk memanggil data menggunakan th:text="${item.namaLengkap}
	@Column(name = "nama_lengkap", length = 100)
	private String namaLengkap;

	@Column(name = "alamat", length = 225)
	private String alamat;

	@Column(name = "tempat_lahir", length = 50)
	private String tempatLahir;

	@Column(name = "tanggal_lahir", length = 100)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date tanggalLahir;

	@Column(name = "agama", length = 10)
	private String agama;

	@Column(name = "jenis_kelamin", length = 10)
	private String jk;

	@Column(name = "golongan_darah", length = 2)
	private String golDarah;

	@Column(name = "kendaraan", length = 1000)
	private String kendaraan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) { 
		this.namaLengkap = namaLengkap;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getAgama() {
		return agama;
	}

	public void setAgama(String agama) {
		this.agama = agama;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getGolDarah() {
		return golDarah;
	}

	public void setGolDarah(String golDarah) {
		this.golDarah = golDarah;
	}

	public String getKendaraan() {
		return kendaraan;
	}

	public void setKendaraan(String kendaraan) {
		this.kendaraan = kendaraan;
	}

}