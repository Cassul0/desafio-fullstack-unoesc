package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "MUNICIPIO")
public class Municipio extends AbstractEntity{

	@Column(name = "codigoIBGE", nullable = false)
	private Long codigoIBGE;
	
	@Column(name = "nomeIBGE", nullable = false)
	private String nomeIBGE;

	@Column(name = "codigoRegiao", nullable = false)
	private Long codigoRegiao;
	
	@Column(name = "nomeRegiao", nullable = false)
	private String nomeRegiao;
	
	@Column(name = "pais", nullable = false)
	private String pais;
	
	@ManyToOne
	@JoinColumn(name = "FK_UNIDADEFEDERATIVA_ID")
	private UnidadeFederativa uf;

	public Long getCodigoIBGE() {
		return codigoIBGE;
	}

	public void setCodigoIBGE(Long codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	public String getNomeIBGE() {
		return nomeIBGE;
	}

	public void setNomeIBGE(String nomeIBGE) {
		this.nomeIBGE = nomeIBGE;
	}

	public Long getCodRegiao() {
		return codigoRegiao;
	}

	public void setCodRegiao(Long codigoRegiao) {
		this.codigoRegiao = codigoRegiao;
	}

	public String getNomeRegiao() {
		return nomeRegiao;
	}

	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public UnidadeFederativa getId_UF() {
		return uf;
	}

	public Long getCodigoRegiao() {
		return codigoRegiao;
	}

	public void setCodigoRegiao(Long codigoRegiao) {
		this.codigoRegiao = codigoRegiao;
	}

	public UnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}

	public void setId_UF(UnidadeFederativa id_UF) {
		this.uf = id_UF;
	}

	@Override
	public String toString() {
		return "Municipio [codigoIBGE=" + codigoIBGE + ", nomeIBGE=" + nomeIBGE + ", codigoRegiao=" + codigoRegiao
				+ ", nomeRegiao=" + nomeRegiao + ", pais=" + pais + ", uf=" + uf + "]";
	}
	
	
}
