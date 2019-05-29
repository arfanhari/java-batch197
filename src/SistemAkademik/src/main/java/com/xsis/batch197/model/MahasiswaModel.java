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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "mahasiswa")
public class MahasiswaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "mahasiswa_seq")
	@TableGenerator(name = "mahasiswa_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "NIM", length = 10, nullable = false)
	private String nim;

	@Column(name = "NM_Mahasiswa", length = 100, nullable = false)
	private String namaMahasiswa;
	
	@Column(name = "Jenis_Kelamin", length = 7, nullable = false)
	private String jk;
	
	@Column(name = "Alamat", length = 225, nullable = false)
	private String alamat;
	
	@Column(name = "jurusan_id", nullable = false)
	private int jurusanId;
	
	@Column(name = "Status", length = 225, nullable = false)
	private String Status;
	
	@ManyToOne
	@JoinColumn(name="jurusan_id", foreignKey = @ForeignKey(name = "fK_mhs_jurusan"), updatable = false, insertable= false)
	private JurusanModel jurusan;
	
	@ManyToMany(mappedBy = "mahasiswa")
	private List<KelasDetailModel> listKelasDetail = new ArrayList<KelasDetailModel>();
	
	public List<KelasDetailModel> getListKelasDetail() {
		return listKelasDetail;
	}

	public void setListKelasDetail(List<KelasDetailModel> listKelasDetail) {
		this.listKelasDetail = listKelasDetail;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
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



	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
