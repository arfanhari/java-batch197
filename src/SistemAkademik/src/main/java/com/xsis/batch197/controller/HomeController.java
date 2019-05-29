package com.xsis.batch197.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String index() {
		return "home/index";
	}
	
//	@RequestMapping(value="home/fakultas")
//	public String fakultas() {
//		return "home/fakultas/fakultas";
//	}
//	
//	@RequestMapping(value="/home/jurusan")
//	public String jurusan() {
//		return "home/jurusan";
//	}
//	
//	@RequestMapping(value="/home/matakuliah")
//	public String matakuliah() {
//		return "home/matakuliah";
//	}
//	
//	@RequestMapping(value="/home/kelas")
//	public String kelas() {
//		return "home/kelas";
//	}
//	
//	@RequestMapping(value="/home/kelas-detail")
//	public String kelasDetail() {
//		return "home/kelas-detail";
//	}
//	
//	@RequestMapping(value="/home/ruang")
//	public String ruang() {
//		return "home/ruang";
//	}
//	
//	@RequestMapping(value="/home/dosen")
//	public String Dosen() {
//		return "home/dosen";
//	}
//	
//	@RequestMapping(value="/home/mahasiswa")
//	public String mahasiswa() {
//		return "home/mahasiswa";
//	}
//	
//	@RequestMapping(value="/home/bobot-nilai")
//	public String bobotNilai() {
//		return "home/bobot-nilai";
//	}
}
