package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder("DadosAPI")
public class DadosApi {
	
	@Column(name = "id", nullable = false)
	private Long id;
	
	@JsonIgnore
	@Column(name = "beneficiario", nullable = false)
	private String beneficiario;
	
	@JsonIgnore
	@Column(name = "responsavelAuxilioEmergencial", nullable = false)
	private String responsavelAuxilioEmergencial;

	@Column(name = "mesDisponibilizacao")
	private String mesDisponibilizacao;
	
	@Column(name = "codigoIBGE", nullable = false)
	private Long codigoIBGE;

	@JsonIgnore
	@Column(name = "municipio")
	private Municipio municipio;
	
	@JsonIgnore
	@Column(name = "situacaoAuxilioEmergencial")
	private String situacaoAuxilioEmergencial;

	@JsonIgnore
	@Column(name = "enquadramentoAuxilioEmergencial")
	private String enquadramentoAuxilioEmergencial;
	
	@JsonIgnore
	@Column(name = "valor")
	private String valor;
	
	@JsonIgnore
	@Column(name = "numeroParcela")
	private String numeroParcela;
	
	public String getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getEnquadramentoAuxilioEmergencial() {
		return enquadramentoAuxilioEmergencial;
	}

	public void setEnquadramentoAuxilioEmergencial(String enquadramentoAuxilioEmergencial) {
		this.enquadramentoAuxilioEmergencial = enquadramentoAuxilioEmergencial;
	}

	public String getSituacaoAuxilioEmergencial() {
		return situacaoAuxilioEmergencial;
	}

	public void setSituacaoAuxilioEmergencial(String situacaoAuxilioEmergencial) {
		this.situacaoAuxilioEmergencial = situacaoAuxilioEmergencial;
	}

	public String getResponsavelAuxilioEmergencial() {
		return responsavelAuxilioEmergencial;
	}

	public void setResponsavelAuxilioEmergencial(String responsavelAuxilioEmergencial) {
		this.responsavelAuxilioEmergencial = responsavelAuxilioEmergencial;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

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
