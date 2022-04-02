package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder("DadosAPI")
public class DadosApi {
	
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "mesDisponibilizacao")
	private String mesDisponibilizacao;
	
	@Column(name = "beneficiario", nullable = false)
	private Beneficiario beneficiario;
	
	@Column(name = "responsavelAuxilioEmergencial", nullable = false)
	private ResponsavelAuxilioEmergencial responsavelAuxilioEmergencial;

	@Column(name = "municipio")
	private Municipio municipio;
	
	@Column(name = "situacaoAuxilioEmergencial")
	private String situacaoAuxilioEmergencial;

	@Column(name = "enquadramentoAuxilioEmergencial")
	private String enquadramentoAuxilioEmergencial;
	
	@Column(name = "valor")
	private String valor;
	
	@Column(name = "numeroParcela")
	private String numeroParcela;
	
	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public ResponsavelAuxilioEmergencial getResponsavelAuxilioEmergencial() {
		return responsavelAuxilioEmergencial;
	}

	public void setResponsavelAuxilioEmergencial(ResponsavelAuxilioEmergencial responsavelAuxilioEmergencial) {
		this.responsavelAuxilioEmergencial = responsavelAuxilioEmergencial;
	}

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

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Override
	public String toString() {
		return "DadosApi [id=" + id + ", mesDisponibilizacao=" + mesDisponibilizacao + ", beneficiario=" + beneficiario
				+ ", responsavelAuxilioEmergencial=" + responsavelAuxilioEmergencial + ", municipio=" + municipio
				+ ", situacaoAuxilioEmergencial=" + situacaoAuxilioEmergencial + ", enquadramentoAuxilioEmergencial="
				+ enquadramentoAuxilioEmergencial + ", valor=" + valor + ", numeroParcela=" + numeroParcela + "]";
	}
	
	
}
