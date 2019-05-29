package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.KelasDetailModel;
import com.xsis.batch197.model.KelasModel;
import com.xsis.batch197.model.MahasiswaModel;
import com.xsis.batch197.repository.KelasDetailRepo;
import com.xsis.batch197.repository.KelasRepo;
import com.xsis.batch197.repository.MahasiswaRepo;

@Controller
public class KelasDetailController {
	@Autowired
	private KelasDetailRepo kelasDetailRepo;
	
	@Autowired
	private KelasRepo kelasRepo;
	
	@Autowired
	private MahasiswaRepo mahasiswaRepo;
	
	@RequestMapping(value = "/kelas-detail")
	public String jurusan(Model model) {
		List<KelasModel> kelasList = kelasRepo.findAll();
		model.addAttribute("kelasList", kelasList);
		
		List<MahasiswaModel> mahasiswaList = mahasiswaRepo.findAll();
		model.addAttribute("mahasiswaList", mahasiswaList);
		return "home/kelas-detail/kelas-detail";
	}
	
	@RequestMapping(value = "/kelas-detail/save")
	public String save(@ModelAttribute KelasDetailModel dataKelasDetail) {
		kelasDetailRepo.save(dataKelasDetail);
		return "redirect:/kelas-detail/list";
	}

	@RequestMapping(value = "/kelas-detail/list")
	public String list(Model kirim) {
		List<KelasDetailModel> kelasDetailList = kelasDetailRepo.findAll();
		kirim.addAttribute("kelasDetailList", kelasDetailList);
		return "home/kelas-detail/list";
	}
	
	@RequestMapping(value="/kelas-detail/edit/{id}")
    public String edit(Model model, @PathVariable(name = "id") Integer id) {
        KelasDetailModel kelasDetailEdit = kelasDetailRepo.findById(id).orElse(null);
        model.addAttribute("kelasDetailEdit", kelasDetailEdit);
        
        List<KelasModel> kelasList = kelasRepo.findAll();
		model.addAttribute("kelasList", kelasList);
		
		List<MahasiswaModel> mahasiswaList = mahasiswaRepo.findAll();
		model.addAttribute("mahasiswaList", mahasiswaList);
        return "home/kelas-detail/edit";
    }
	
	@RequestMapping(value="/kelas-detail/hapus/{id}")
    public String hapus(@PathVariable(name = "id") Integer id) {
        KelasDetailModel kelasDetailHapus = kelasDetailRepo.findById(id).orElse(null);
        kelasDetailRepo.delete(kelasDetailHapus);
        return "redirect:/kelas-detail/list";
	}
}
