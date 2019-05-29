package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.DosenModel;
import com.xsis.batch197.repository.DosenRepo;

@Controller
public class DosenController {
//	berfungsi untuk mengghubungkan kontroler dengan repositori
	@Autowired
	private DosenRepo dosenRepo;

	@RequestMapping(value = "/dosen")
	public String dosen(Model dosen) {
		return "home/dosen/dosen";
	}

	@RequestMapping(value = "/dosen/save")
	public String save(@ModelAttribute DosenModel dataDosen) {
		dosenRepo.save(dataDosen);
		return "redirect:/dosen/list";
	}

	@RequestMapping(value = "/dosen/list")
	public String list(Model kirim) {
		List<DosenModel> dosenList = dosenRepo.findAll();
		kirim.addAttribute("dosenList", dosenList);
		return "home/dosen/list";
	}
	
	@RequestMapping(value="/dosen/edit/{id}")
    public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
        DosenModel dosenEdit = dosenRepo.findById(id).orElse(null);
        kirim.addAttribute("dosenEdit", dosenEdit);
        return "home/dosen/edit";
    }
	
	@RequestMapping(value="/dosen/hapus/{id}")
    public String hapus(@PathVariable(name = "id") Integer id) {
        DosenModel dosenHapus = dosenRepo.findById(id).orElse(null);
        dosenRepo.delete(dosenHapus);
        return "redirect:/dosen/list";
	}
}
