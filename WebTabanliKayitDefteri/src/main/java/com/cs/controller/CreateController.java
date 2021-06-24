package com.cs.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cs.business.abstracts.IKayitService;
import com.cs.dao.abstracts.IKayitDao;
import com.cs.model.Kayit;

@Controller
public class CreateController {

	@Autowired
	private IKayitService kayitService;
	
	
	@RequestMapping(value = "/create")
	public ModelAndView createKayitLink(ModelAndView model) throws IOException {

		model.setViewName("create");

		return model;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createKayit(@RequestParam("adi") String adi, 
			@RequestParam("soyadi") String soyadi,
			@RequestParam("kangrubu") String kangrubu,
			@RequestParam("ceptel") String ceptel,
			@RequestParam("adres") String adres,
			ModelAndView mv) {

			Kayit kayit = new Kayit();
			kayit.setAdi(adi);
			kayit.setSoyadi(soyadi);
			kayit.setKanGrubu(kangrubu);
			kayit.setCepTel(ceptel);
			kayit.setAdres(adres);
			int counter = kayitService.addKayit(kayit);
	
			if (counter > 0) {
				mv.addObject("msg", "Kayit registration successful.");
			} else {
				mv.addObject("msg", "Error- check the console log.");
			}
		
		mv.setViewName("create");
		return mv;
	}
	

}
