package com.rss.primeira.aplicacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controlador
 * @author Rafael Santos (<a href="mailto:rafaelsantos1983@gmail.com">rafaelsantos1983@gmail.com</a>)
 */
@Controller
public class PrimeiraAplicacaoController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String paginaInicial() { 
		return "paginaInicial";
	}
	
}
