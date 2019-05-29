package com.xsis.batch197.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "jurusan")
public class JurusanModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "jurusan_seq")
	@TableGenerator(name = "jurusan_seq", table = "tbl_sequences",pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "kd_jurusan", length = 10, nullable=false)
	private String kodeJurusan;
	
	@Column(name = "nm_jurusan", length = 100, nullable=false)
	private String namaJurusan;
	
	@Column(name = "fakultas_id", nullable=false)
	private int fakultasId;
	
//	buat relasi dengan fakultas
	@ManyToOne
	@JoinColumn(name="fakultas_id", foreignKey=@ForeignKey(name="fk_jurusan_fak"), updatable = false, insertable = false)
	private FakultasModel fakultas;
	
//	menyimpan data-data jurusan pada listMK yang nantinya akan digunakan di form MK
	@OneToMany(mappedBy="jurusan")
	private List<MatakuliahModel> listMK = new ArrayList<MatakuliahModel>();
	
	@OneToMany(mappedBy="jurusan")
	private List<MahasiswaModel> listMhs = new ArrayList<MahasiswaModel>();
	

	public List<MatakuliahModel> getListMK() {
		return listMK;
	}

	public void setListMK(List<MatakuliahModel> listMK) {
		this.listMK = listMK;
	}

	public int getFakultasId() {
		return fakultasId;
	}

	public void setFakultasId(int fakultasId) {
		this.fakultasId = fakultasId;
	}

	public FakultasModel getFakultas() {
		return fakultas;
	}

	public void setFakultas(FakultasModel fakultas) {
		this.fakultas = fakultas;
	}
	
	public List<MahasiswaModel> getListMhs() {
		return listMhs;
	}

	public void setListMhs(List<MahasiswaModel> listMhs) {
		this.listMhs = listMhs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodeJurusan() {
		return kodeJurusan;
	}

	public void setKodeJurusan(String kodeJurusan) {
		this.kodeJurusan = kodeJurusan;
	}

	public String getNamaJurusan() {
		return namaJurusan;
	}

	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
	}
}
