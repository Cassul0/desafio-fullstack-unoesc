package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.*;

@Entity
@Table(name = "UNIDADEFEDERATIVA")
public class UnidadeFederativa extends AbstractEntity{

	@Column(name = "sigla", nullable = false)
	private String sigla;
	
	@Column(name = "nome", nullable = false)
	private String nome;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
