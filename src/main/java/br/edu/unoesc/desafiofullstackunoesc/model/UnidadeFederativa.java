package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.*;

@Entity
@Table(name = "UNIDADEFEDERATIVA")
public class UnidadeFederativa {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_unidadeFederativa;
	
	@Column(name = "sigla", nullable = false)
	private String sigla;
	
	@Column(name = "nome", nullable = false)
	private String nome;

	public Long getId_unidadeFederativa() {
		return id_unidadeFederativa;
	}

	public void setId_unidadeFederativa(Long id_unidadeFederativa) {
		this.id_unidadeFederativa = id_unidadeFederativa;
	}

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
