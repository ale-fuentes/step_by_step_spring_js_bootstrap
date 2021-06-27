package edu.ale.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ale.brewer.model.Usuario;

@Controller
public class UsuarioController {

	//GET
	@RequestMapping("/usuarios/novo")
	public String novo(Usuario usuario) {
		return "usuario/CadastroUsuario";
	}
}
