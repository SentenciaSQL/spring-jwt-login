package com.example.login.service;

import com.example.login.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
}
