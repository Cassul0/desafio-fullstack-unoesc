package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario extends AbstractEntity{
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "senha", nullable = false, length = 255)
	private String senha;

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
