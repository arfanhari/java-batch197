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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "kelasdetail")
public class KelasDetailModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "kelasdetail_seq")
	@TableGenerator(name = "kelasdetail_seq", table = "tbl_sequences",pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "kelas_id", nullable = false)
	private int kelasId;
	
	@Column(name = "mahasiswa_id", nullable = false)
	private int mahasiswaId;
	
	@ManyToMany
	@JoinColumn(name = "kelas_id", foreignKey=@ForeignKey(name="fk_kelas_kelasdetail"), updatable = false, insertable = false)
	private List<KelasModel> listKelas = new ArrayList<KelasModel>();
	
	@ManyToMany
	@JoinColumn(name = "mahasiswa_id", foreignKey=@ForeignKey(name="fk_mahasiswa_kelasdetail"), updatable = false, insertable = false)
	private List<MahasiswaModel> listMhs = new ArrayList<MahasiswaModel>();
	
	@Column(name = "Bobot", nullable=false)
	private int bobot;
	
	@Column(name = "Status", length = 10, nullable=false)
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKelasId() {
		return kelasId;
	}

	public void setKelasId(int kelasId) {
		this.kelasId = kelasId;
	}

	public int getMahasiswaId() {
		return mahasiswaId;
	}

	public void setMahasiswaId(int mahasiswaId) {
		this.mahasiswaId = mahasiswaId;
	}

	public List<KelasModel> getListKelas() {
		return listKelas;
	}

	public void setListKelas(List<KelasModel> listKelas) {
		this.listKelas = listKelas;
	}

	public List<MahasiswaModel> getListMhs() {
		return listMhs;
	}

	public void setListMhs(List<MahasiswaModel> listMhs) {
		this.listMhs = listMhs;
	}

	public int getBobot() {
		return bobot;
	}

	public void setBobot(int bobot) {
		this.bobot = bobot;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
