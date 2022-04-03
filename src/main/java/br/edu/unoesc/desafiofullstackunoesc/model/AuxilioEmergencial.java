package br.edu.unoesc.desafiofullstackunoesc.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
public class AuxilioEmergencial extends AbstractEntity{

	@Column(name = "dataConsulta")
	private Date dataConsulta;
	
	@Column(name = "mesDisponibilizacao")
	private String mesDisponibilizacao;
	
	@ManyToOne
	@JoinColumn(name = "FK_MUNICIPIO_ID")
	private UnidadeFederativa id_UF;

	@Column(name = "numeroParcela")
	private String numeroParcela;
	
	@Column(name = "valorTotal")
	private BigDecimal valorTotal;

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	public String getMesDisponibilizacao() {
		return mesDisponibilizacao;
	}

	public void setMesDisponibilizacao(String mesDisponibilizacao) {
		this.mesDisponibilizacao = mesDisponibilizacao;
	}

	public UnidadeFederativa getId_UF() {
		return id_UF;
	}

	public void setId_UF(UnidadeFederativa id_UF) {
		this.id_UF = id_UF;
	}

	public String getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
