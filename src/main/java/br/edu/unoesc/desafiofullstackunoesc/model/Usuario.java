package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	@Column(name = "username", unique = true, nullable = false)
	private String username;
	
	@Column(name = "senha", nullable = false)
	private String senha;

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
