package com.cs.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cs.business.abstracts.IKayitService;
import com.cs.dao.abstracts.IKayitDao;
import com.cs.model.Kayit;

@Controller
public class ReadController {

	@Autowired
	private IKayitService kayitService;

	@RequestMapping(value = "/read")
	public ModelAndView readKayit(ModelAndView model) throws IOException {

		List<Kayit> listKayit = kayitService.listKayit();
		model.addObject("listKayit", listKayit);
		model.setViewName("read");

		return model;
	}
}
