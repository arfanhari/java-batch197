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
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tbl_biodata")
public class BiodataModel {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="biodata_idx")
	@TableGenerator(name="biodata_idx", table="tbl_index", pkColumnName="index_id", valueColumnName="index_value", initialValue=0, allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nik", length=20, nullable=false)
	@NotNull
	private String nik;
	
	@Column(name="nama", length=100, nullable=false)
	@NotNull
	private String nama;
	
	@Column(name="alamat", length=100, nullable=false)
	private String alamat;
	
	@Column(name="kelurahan_id", length=100, nullable=false)
	private Integer kelurahanId;
	
	@Column(name="kecamatan_id", length=100, nullable=false)
	private Integer kecamatanId;
	
	@Column(name="kota_id", length=100, nullable=false)
	private Integer kotaId;
	
	@Column(name="provinsi_id", length=100, nullable=false)
	private Integer provinsiId;
	
	@Column(name="jk", length=10, nullable=false)
	private String jk;
	
	@Column(name="tpt_lahir", length=100, nullable=false)
	private String tptLahir;
	
	@Column(name="tgl_lahir", nullable=false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date tglLahir;
	
	@Column(name="agama", length=20, nullable=false)
	private String agama;
	
	@Column(name="gol_darah", length=2, nullable=false)
	private String golDarah;
	
	@Column(name="status_nikah", length=10, nullable=false)
	private String statusNikah;
	
	@Column(name="warga_negara", length=5, nullable=false)
	private String wargaNegara;
	
	
}