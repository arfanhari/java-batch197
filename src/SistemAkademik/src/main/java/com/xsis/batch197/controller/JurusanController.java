package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.FakultasModel;
import com.xsis.batch197.model.JurusanModel;
import com.xsis.batch197.repository.FakultasRepo;
import com.xsis.batch197.repository.JurusanRepo;

@Controller
public class JurusanController {
	@Autowired
	private JurusanRepo jurusanRepo;
	
	@Autowired
	private FakultasRepo fakultasRepo;
	
	@RequestMapping(value = "/jurusan")
	public String jurusan(Model fakultas) {
		List<FakultasModel> listFakultas = fakultasRepo.findAll();
		fakultas.addAttribute("listFakultas", listFakultas);
		//tempat patch fisik view
		return "home/jurusan/jurusan";
	}
	
	@RequestMapping(value = "/jurusan/save")
	public String save(@ModelAttribute JurusanModel dataJurusan) {
		jurusanRepo.save(dataJurusan);
		return "redirect:/jurusan/list";
	}

	@RequestMapping(value = "/jurusan/list")
	public String list(Model kirim) {
		//.findAll mengambil data 
		List<JurusanModel> jurusanList = jurusanRepo.findAll();
		//kirim.addAttribute ke view 
		kirim.addAttribute("jurusanList", jurusanList);
		return "home/jurusan/list";
	}
	
	@RequestMapping(value="/jurusan/edit/{id}")
    public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
        JurusanModel jurusanEdit = jurusanRepo.findById(id).orElse(null);
        kirim.addAttribute("jurusanEdit", jurusanEdit);
        
        List<FakultasModel> listFakultas = fakultasRepo.findAll();
		kirim.addAttribute("listFakultas", listFakultas);
        return "home/jurusan/edit";
    }
	
	@RequestMapping(value="/jurusan/hapus/{id}")
    public String hapus(@PathVariable(name = "id") Integer id) {
        JurusanModel jurusanHapus = jurusanRepo.findById(id).orElse(null);
        jurusanRepo.delete(jurusanHapus);
        return "redirect:/jurusan/list";
	}
}
