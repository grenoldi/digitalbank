package com.digitalbank.digitalbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.digitalbank.digitalbank.models.CadastroEndereco;
import com.digitalbank.digitalbank.repository.CadastroEnderecoRepository;


@Controller
public class CadastroEnderecoController {
	
	@Autowired
	private CadastroEnderecoRepository er;
	
	@RequestMapping(value = "/dadosEndereco", method=RequestMethod.GET)
	public String form() {
		return("cadastro/dadosEndereco");
	}
	
	@RequestMapping(value = "/dadosEndereco", method=RequestMethod.POST)
	public String form(CadastroEndereco ce) {
		
		er.save(ce);
		
		return "redirect:/dadosEndereco";
	}
}

