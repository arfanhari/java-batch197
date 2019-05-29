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
@Table(name = "Ruang")
public class RuangModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "ruang_seq")
	@TableGenerator(name = "ruang_seq", table = "tbl_sequences",pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "KD_Ruang", length = 10, nullable=false)
	private String kodeRuang;
	
	@Column(name = "NM_Ruang", length = 100, nullable=false)
	private String namaRuang;
	
	@Column(name = "Kapasitas", nullable=false)
	private int Kapasitas;
	
	@OneToMany(mappedBy = "ruang")
	private List<KelasModel> listKelas = new ArrayList<KelasModel>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodeRuang() {
		return kodeRuang;
	}

	public void setKodeRuang(String kodeRuang) {
		this.kodeRuang = kodeRuang;
	}

	public String getNamaRuang() {
		return namaRuang;
	}

	public void setNamaRuang(String namaRuang) {
		this.namaRuang = namaRuang;
	}

	public int getKapasitas() {
		return Kapasitas;
	}

	public void setKapasitas(int kapasitas) {
		Kapasitas = kapasitas;
	}

	public List<KelasModel> getListKelas() {
		return listKelas;
	}

	public void setListKelas(List<KelasModel> listKelas) {
		this.listKelas = listKelas;
	}
	
}
