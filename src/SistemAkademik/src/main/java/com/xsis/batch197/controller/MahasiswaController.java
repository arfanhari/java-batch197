package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.JurusanModel;
import com.xsis.batch197.model.MahasiswaModel;
import com.xsis.batch197.repository.JurusanRepo;
import com.xsis.batch197.repository.MahasiswaRepo;

@Controller
public class MahasiswaController {
	@Autowired
	private MahasiswaRepo mahasiswaRepo;
	
	@Autowired
	private JurusanRepo jurusanRepo;
	
	@RequestMapping(value = "/mahasiswa")
	public String mahasiswa(Model jurusan) {
		List<JurusanModel> listJurusan = jurusanRepo.findAll();
		jurusan.addAttribute("listJurusan", listJurusan);
		return "home/mahasiswa/mahasiswa";
	}
	
	@RequestMapping(value = "/mahasiswa/save")
	public String save(@ModelAttribute MahasiswaModel dataMahasiswa) {
		mahasiswaRepo.save(dataMahasiswa);
		return "redirect:/mahasiswa/list";
	}

	@RequestMapping(value = "/mahasiswa/list")
	public String list(Model kirim) {
		List<MahasiswaModel> mahasiswaList = mahasiswaRepo.findAll();
		kirim.addAttribute("mahasiswaList", mahasiswaList);
		return "home/mahasiswa/list";
	}
	
	@RequestMapping(value="/mahasiswa/edit/{id}")
    public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
        MahasiswaModel mahasiswaEdit = mahasiswaRepo.findById(id).orElse(null);
        kirim.addAttribute("mahasiswaEdit", mahasiswaEdit);
        
        List<JurusanModel> listJurusan = jurusanRepo.findAll();
		kirim.addAttribute("listJurusan", listJurusan);
        return "home/mahasiswa/edit";
    }
	
	@RequestMapping(value="/mahasiswa/hapus/{id}")
    public String hapus(@PathVariable(name = "id") Integer id) {
        MahasiswaModel mahasiswaHapus = mahasiswaRepo.findById(id).orElse(null);
        mahasiswaRepo.delete(mahasiswaHapus);
        return "redirect:/mahasiswa/list";
	}
}