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
@Table(name = "kelas")
public class KelasModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "kelas_seq")
	@TableGenerator(name = "kelas_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;
	
	@Column(name = "kd_kelas", length = 10, nullable = false)
	private String kodeKelas;

	@Column(name = "nm_kelas", length = 50, nullable = false)
	private String namaKelas;
	
	@Column(name = "dosen_id", nullable=false)
	private int dosenId;
	
	@Column(name = "matakuliah_id", nullable=false)
	private int matakuliahId;
	
	@Column(name = "ruang_id", nullable=false)
	private int ruangId;
	
	@ManyToOne
	@JoinColumn(name="dosen_id", foreignKey=@ForeignKey(name="fk_dosen_kelas"), updatable = false, insertable = false)
	private DosenModel dosen;
	
	@ManyToOne
	@JoinColumn(name="matakuliah_id", foreignKey=@ForeignKey(name="fk_matakuliah_kelas"), updatable = false, insertable = false)
	private MatakuliahModel matakuliah;
	
	@ManyToOne
	@JoinColumn(name="ruang_id", foreignKey=@ForeignKey(name="fk_ruang_kelas"), updatable = false, insertable = false)
	private RuangModel ruang;
	
	@ManyToMany(mappedBy = "kelas")
	private List<KelasDetailModel> listKelasDetail = new ArrayList<KelasDetailModel>();

	public List<KelasDetailModel> getListKelasDetail() {
		return listKelasDetail;
	}

	public void setListKelasDetail(List<KelasDetailModel> listKelasDetail) {
		this.listKelasDetail = listKelasDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodeKelas() {
		return kodeKelas;
	}

	public void setKodeKelas(String kodeKelas) {
		this.kodeKelas = kodeKelas;
	}

	public String getNamaKelas() {
		return namaKelas;
	}

	public void setNamaKelas(String namaKelas) {
		this.namaKelas = namaKelas;
	}

	public int getDosenId() {
		return dosenId;
	}

	public void setDosenId(int dosenId) {
		this.dosenId = dosenId;
	}


	public int getMatakuliahId() {
		return matakuliahId;
	}

	public void setMatakuliahId(int matakuliahId) {
		this.matakuliahId = matakuliahId;
	}

	public int getRuangId() {
		return ruangId;
	}

	public void setRuangId(int ruangId) {
		this.ruangId = ruangId;
	}

	public DosenModel getDosen() {
		return dosen;
	}

	public void setDosen(DosenModel dosen) {
		this.dosen = dosen;
	}

	public MatakuliahModel getMatakuliah() {
		return matakuliah;
	}

	public void setMatakuliah(MatakuliahModel matakuliah) {
		this.matakuliah = matakuliah;
	}

	public RuangModel getRuang() {
		return ruang;
	}

	public void setRuang(RuangModel ruang) {
		this.ruang = ruang;
	}

	
}