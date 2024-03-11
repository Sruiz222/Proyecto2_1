package com.sara.proyectospringboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sara.proyectospringboot.models.Rol;
import com.sara.proyectospringboot.models.Usuario;
import com.sara.proyectospringboot.repositorys.IUsuarioRepository;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@GetMapping("")
    public String formularioUsuario(Usuario usuario, Model model) {
        return "usuarioform";
    }
	
	@GetMapping("/login")
    public String login(Usuario usuario, Model model) {
        return "login";
    }
	
	@PostMapping("")
	public String guardarUsuario(Usuario usuario) {
    	Rol rol = new Rol();
    	rol.setId(2L);
    	usuario.setRol(rol);
        usuarioRepository.save(usuario);
        return "redirect:/usuario/login";
    }
}
