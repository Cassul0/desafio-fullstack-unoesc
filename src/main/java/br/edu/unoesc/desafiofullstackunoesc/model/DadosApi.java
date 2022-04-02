package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder("DadosAPI")
public class DadosApi {
	
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "mesDisponibilizacao")
	private String mesDisponibilizacao;
	
	@Column(name = "codigoIBGE", nullable = false)
	private Long codigoIBGE;

	@Column(name = "municipio")
	private Municipio municipio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMesDisponibilizacao() {
		return mesDisponibilizacao;
	}

	public void setMesDisponibilizacao(String mesDisponibilizacao) {
		this.mesDisponibilizacao = mesDisponibilizacao;
	}

	public Long getCodigoIBGE() {
		return codigoIBGE;
	}

	public void setCodigoIBGE(Long codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
	
}
