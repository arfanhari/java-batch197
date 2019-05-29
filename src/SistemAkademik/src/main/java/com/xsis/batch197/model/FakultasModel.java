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
//membuat tabel di database
@Table(name = "fakultas")
public class FakultasModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "fakultas_seq")
	@TableGenerator(name = "fakultas_seq", table = "tbl_sequences", pkColumnName = "seq_id", valueColumnName = "seq_value", initialValue = 0, allocationSize = 1)
	@Column(name = "id")
	private int id;

//	@Column membuat kolom di database
	@Column(name = "kd_fakultas", length = 10, nullable = false)
//	deklarasi variabel
	private String kodeFakultas;

	@Column(name = "nm_fakultas", length = 100, nullable = false)
	private String namaFakultas;

	@OneToMany(mappedBy = "fakultas")
	private List<JurusanModel> listJurusan = new ArrayList<JurusanModel>();

	public List<JurusanModel> getListJurusan() {
		return listJurusan;
	}

	public void setListJurusan(List<JurusanModel> listJurusan) {
		this.listJurusan = listJurusan;
	}

//	Cara cepat membuat get dan set method
//	klik kanan di baris kosong > source > generate getters and setters > centang variable > ok
//	get untuk mengambil variables
	public int getId() {
		return id;
	}

//	Set untuk memberikan input pada variabel
	public void setId(int id) {
		this.id = id;
	}

	public String getKodeFakultas() {
		return kodeFakultas;
	}

	public void setKodeFakultas(String kodeFakultas) {
		this.kodeFakultas = kodeFakultas;
	}

	public String getNamaFakultas() {
		return namaFakultas;
	}

	public void setNamaFakultas(String namaFakultas) {
		this.namaFakultas = namaFakultas;
	}

}
