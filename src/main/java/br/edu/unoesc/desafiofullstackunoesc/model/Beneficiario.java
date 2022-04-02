package br.edu.unoesc.desafiofullstackunoesc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Beneficiario {

	@JsonIgnore
	private String cpfFormatado;
	
	@JsonIgnore
	private String nis;
	
	@JsonIgnore
	private String nome;

	public String getCpfFormatado() {
		return cpfFormatado;
	}

	public void setCpfFormatado(String cpfFormatado) {
		this.cpfFormatado = cpfFormatado;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Beneficiario [cpfFormatado=" + cpfFormatado + ", nis=" + nis + ", nome=" + nome + "]";
	}
	
	
}
