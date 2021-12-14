package com.example.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}
