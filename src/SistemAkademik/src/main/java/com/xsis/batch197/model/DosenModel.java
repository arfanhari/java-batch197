package com.xsis.batch197.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "dosen")
public class DosenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "dosen_seq")
	@TableGenerator(name = "dosen_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "KD_Dosen", length = 10, nullable = false)
	private String kodeDosen;
	
	@Column(name = "NM_Dosen", length = 100, nullable = false)
	private String namaDosen;
	
	@Column(name = "Jenis_Kelamin", length = 7, nullable = false)
	private String jk;
	
	@Column(name = "Alamat", length = 225, nullable = false)
	private String alamat;
	
	@OneToMany(mappedBy = "dosen")
	private List<KelasModel> listKelas = new ArrayList<KelasModel>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodeDosen() {
		return kodeDosen;
	}

	public void setKodeDosen(String kodeDosen) {
		this.kodeDosen = kodeDosen;
	}

	public String getNamaDosen() {
		return namaDosen;
	}

	public void setNamaDosen(String namaDosen) {
		this.namaDosen = namaDosen;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public List<KelasModel> getListKelas() {
		return listKelas;
	}

	public void setListKelas(List<KelasModel> listKelas) {
		this.listKelas = listKelas;
	}

	
	
}
