package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.*;

@Entity
@Table(name = "MUNICIPIO")
public class Municipio {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_municipio;
	
	@Column(name = "codIBGE", nullable = false)
	private Long codIBGE;
	
	@Column(name = "nomeIBGE", nullable = false)
	private String nomeIBGE;

	@Column(name = "codRegiao", nullable = false)
	private Long codRegiao;
	
	@Column(name = "nomeRegiao", nullable = false)
	private String nomeRegiao;
	
	@Column(name = "pais", nullable = false)
	private String pais;
	
	@ManyToOne
	@JoinColumn(name = "FK_UNIDADEFEDERATIVA_ID")
	private UnidadeFederativa id_UF;

	public Long getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Long id_municipio) {
		this.id_municipio = id_municipio;
	}

	public Long getCodIBGE() {
		return codIBGE;
	}

	public void setCodIBGE(Long codIBGE) {
		this.codIBGE = codIBGE;
	}

	public String getNomeIBGE() {
		return nomeIBGE;
	}

	public void setNomeIBGE(String nomeIBGE) {
		this.nomeIBGE = nomeIBGE;
	}

	public Long getCodRegiao() {
		return codRegiao;
	}

	public void setCodRegiao(Long codRegiao) {
		this.codRegiao = codRegiao;
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
		return id_UF;
	}

	public void setId_UF(UnidadeFederativa id_UF) {
		this.id_UF = id_UF;
	}
	
	
}
