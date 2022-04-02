package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;

public class ConsultaApi {

	@Column(name = "codIBGE", nullable = false)
	private Long codIBGE;

	@Column(name = "mesRef", nullable = false)
	private Long mesRef;
	
	@Column(name = "anoRef", nullable = false)
	private Long anoRef;
	
	@Column(name = "pagina", nullable = false)
	private Long pagina;

	public Long getCodIBGE() {
		return codIBGE;
	}

	public void setCodIBGE(Long codIBGE) {
		this.codIBGE = codIBGE;
	}

	public Long getMesRef() {
		return mesRef;
	}

	public void setMesRef(Long mesRef) {
		this.mesRef = mesRef;
	}

	public Long getAnoRef() {
		return anoRef;
	}

	public void setAnoRef(Long anoRef) {
		this.anoRef = anoRef;
	}

	public Long getPagina() {
		return pagina;
	}

	public void setPagina(Long pagina) {
		this.pagina = pagina;
	}
	
	
}
