package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.BobotNilaiModel;
import com.xsis.batch197.repository.BobotNilaiRepo;

@Controller
public class BobotNilaiController {
//	berfungsi untuk mengghubungkan kontroler dengan repositori
	@Autowired
	private BobotNilaiRepo bobotNilaiRepo;

	@RequestMapping(value = "/bobot-nilai")
	public String bobotNilai() {
		return "home/bobot-nilai/bobot-nilai";
	}

	@RequestMapping(value = "/bobot-nilai/save")
	public String save(@ModelAttribute BobotNilaiModel dataBobotNilai) {
		bobotNilaiRepo.save(dataBobotNilai);
		return "redirect:/bobot-nilai/list";
	}

	@RequestMapping(value = "/bobot-nilai/list")
	public String list(Model kirim) {
		List<BobotNilaiModel> bobotNilaiList = bobotNilaiRepo.findAll();
		kirim.addAttribute("bobotNilaiList", bobotNilaiList);
		return "home/bobot-nilai/list";
	}
	
	@RequestMapping(value="/bobot-nilai/edit/{id}")
    public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
        BobotNilaiModel bobotNilaiEdit = bobotNilaiRepo.findById(id).orElse(null);
        kirim.addAttribute("bobotNilaiEdit", bobotNilaiEdit);
        return "home/bobot-nilai/edit";
    }
	
	@RequestMapping(value="/bobot-nilai/hapus/{id}")
    public String hapus(@PathVariable(name = "id") Integer id) {
        BobotNilaiModel bobotNilaiHapus = bobotNilaiRepo.findById(id).orElse(null);
        bobotNilaiRepo.delete(bobotNilaiHapus);
        return "redirect:/bobot-nilai/list";
	}
}
