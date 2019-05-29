package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.FakultasModel;
import com.xsis.batch197.repository.FakultasRepo;

@Controller
public class FakultasController {
//	berfungsi untuk mengghubungkan kontroler dengan repositori
	@Autowired
	private FakultasRepo fakultasRepo;

	@RequestMapping(value = "/fakultas")
	public String fakultas() {
		return "home/fakultas/fakultas";
	}

	@RequestMapping(value = "/fakultas/save")
	public String save(@ModelAttribute FakultasModel dataFakultas) {
		fakultasRepo.save(dataFakultas);
		return "redirect:/fakultas/list";
	}

	@RequestMapping(value = "/fakultas/list")
	public String list(Model kirim) {
		List<FakultasModel> fakultasList = fakultasRepo.findAll();
		kirim.addAttribute("fakultasList", fakultasList);
		return "home/fakultas/list";
	}
	
	@RequestMapping(value="/fakultas/edit/{id}")
    public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
        FakultasModel fakultasEdit = fakultasRepo.findById(id).orElse(null);
        kirim.addAttribute("fakultasEdit", fakultasEdit);
        return "home/fakultas/edit";
    }
	
	@RequestMapping(value="/fakultas/hapus/{id}")
    public String hapus(@PathVariable(name = "id") Integer id) {
        FakultasModel fakultasHapus = fakultasRepo.findById(id).orElse(null);
        fakultasRepo.delete(fakultasHapus);
        return "redirect:/fakultas/list";
	}
}
