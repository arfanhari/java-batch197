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
@Table(name = "matakuliah")
public class MatakuliahModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "matakuliah_seq")
	@TableGenerator(name = "matakuliah_seq", table = "tbl_sequences",pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "kd_mk", length = 10, nullable=false)
	private String kodeMatakuliah;
	
	@Column(name = "nm_mk", length = 100, nullable=false)
	private String namaMatakuliah;
	
	@Column(name = "sks", nullable=false)
	private int sks;
	
	@Column(name = "jurusan_id", nullable=false)
	private int jurusanId;
	
//	buat relasi dengan JurusanModel
	@ManyToOne
	@JoinColumn(name = "jurusan_id", foreignKey = @ForeignKey(name="fk_mk_jurusan"), updatable = false, insertable = false)
	private JurusanModel jurusan;
	
	@OneToMany(mappedBy = "matakuliah")
	private List<KelasModel> listKelas = new ArrayList<KelasModel>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodeMatakuliah() {
		return kodeMatakuliah;
	}

	public void setKodeMatakuliah(String kodeMatakuliah) {
		this.kodeMatakuliah = kodeMatakuliah;
	}

	public String getNamaMatakuliah() {
		return namaMatakuliah;
	}

	public void setNamaMatakuliah(String namaMatakuliah) {
		this.namaMatakuliah = namaMatakuliah;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public int getJurusanId() {
		return jurusanId;
	}

	public void setJurusanId(int jurusanId) {
		this.jurusanId = jurusanId;
	}

	public JurusanModel getJurusan() {
		return jurusan;
	}

	public void setJurusan(JurusanModel jurusan) {
		this.jurusan = jurusan;
	}

	public List<KelasModel> getListKelas() {
		return listKelas;
	}

	public void setListKelas(List<KelasModel> listKelas) {
		this.listKelas = listKelas;
	}

}
