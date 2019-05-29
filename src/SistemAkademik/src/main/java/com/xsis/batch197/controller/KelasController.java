package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.DosenModel;
import com.xsis.batch197.model.KelasModel;
import com.xsis.batch197.model.MatakuliahModel;
import com.xsis.batch197.model.RuangModel;
import com.xsis.batch197.repository.DosenRepo;
import com.xsis.batch197.repository.KelasRepo;
import com.xsis.batch197.repository.MatakuliahRepo;
import com.xsis.batch197.repository.RuangRepo;

@Controller
public class KelasController {
	@Autowired
	private KelasRepo kelasRepo;
	
	@Autowired
	private DosenRepo dosenRepo;
	
	@Autowired
	private MatakuliahRepo mkRepo;
	
	@Autowired
	private RuangRepo ruangRepo;
	
	@RequestMapping(value = "/kelas")
	public String jurusan(Model model) {
		List<DosenModel> listDosen = dosenRepo.findAll();
		model.addAttribute("listDosen", listDosen);
		
		List<MatakuliahModel> listMK = mkRepo.findAll();
		model.addAttribute("listMK", listMK);
		
		List<RuangModel> listRuang = ruangRepo.findAll();
		model.addAttribute("listRuang", listRuang);
		
		return "home/kelas/kelas";
	}
	
	@RequestMapping(value = "/kelas/save")
	public String save(@ModelAttribute KelasModel dataKelas) {
		kelasRepo.save(dataKelas);
		return "redirect:/kelas/list";
	}

	@RequestMapping(value = "/kelas/list")
	public String list(Model kirim) {
		List<KelasModel> kelasList = kelasRepo.findAll();
		kirim.addAttribute("kelasList", kelasList);
		return "home/kelas/list";
	}
	
	@RequestMapping(value="/kelas/edit/{id}")
    public String edit(Model model, @PathVariable(name = "id") Integer id) {
        KelasModel kelasEdit = kelasRepo.findById(id).orElse(null);
        model.addAttribute("kelasEdit", kelasEdit);
        
        List<DosenModel> listDosen = dosenRepo.findAll();
		model.addAttribute("listDosen", listDosen);
		
		List<MatakuliahModel> listMK = mkRepo.findAll();
		model.addAttribute("listMK", listMK);
		
		List<RuangModel> listRuang = ruangRepo.findAll();
		model.addAttribute("listRuang", listRuang);
        
        return "home/kelas/edit";
    }
	
	@RequestMapping(value="/kelas/hapus/{id}")
    public String hapus(@PathVariable(name = "id") Integer id) {
        KelasModel kelasHapus = kelasRepo.findById(id).orElse(null);
        kelasRepo.delete(kelasHapus);
        return "redirect:/kelas/list";
	}
}
