package com.example.login.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200", "*"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@GetMapping("/clientes")
	public String getClientes() {
		return "Todos los clinetes, no teoken";
	}
	
	@Secured({"ROLE_USER", "ROLE_ADMIN"})
	@GetMapping("/clientes2")
	public String getClientes2() {
		return "Todos los clinetes, con el teoken ";
	}

	@Secured("ROLE_SUBSCRIBER")
	@GetMapping("/subs")
	public String getSubs() {
		return "Endpoints de SUBS";
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/admin")
	public String getAdmin() {
		return "Endpoints de ADMIN";
	}
}
