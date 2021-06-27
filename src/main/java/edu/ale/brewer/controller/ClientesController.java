package edu.ale.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ale.brewer.model.Cliente;

@Controller
public class ClientesController {

	//GET
	@RequestMapping("/clientes/novo")
	public String novo(Cliente cliente) {
		return "cliente/CadastroCliente";
	}
	
}
