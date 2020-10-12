package com.digitalbank.digitalbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.digitalbank.digitalbank.models.CadastroPessoal;
import com.digitalbank.digitalbank.repository.CadastroPessoalRepository;

@Controller
public class CadastroPessoalController {
	
	@Autowired
	private CadastroPessoalRepository br;
	
	@RequestMapping(value = "/dadosPessoais", method=RequestMethod.GET)
	public String form() {
		return("cadastro/dadosPessoais");
	}
	
	@RequestMapping(value = "/dadosPessoais", method=RequestMethod.POST)
	public String form(CadastroPessoal cp) {
		
		br.save(cp);
		
		return "redirect:/dadosPessoais";
	}
}
