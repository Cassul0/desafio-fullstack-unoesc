package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;

public class DadosAPI {
	@Column(name = "codIBGE", nullable = false)
	private Long codIBGE;

	@Column(name = "mesRef", nullable = false)
	private Long mesRef;
	
	@Column(name = "anoRef", nullable = false)
	private Long anoRef;
	
	@Column(name = "pagina", nullable = false)
	private Long pagina;
}
