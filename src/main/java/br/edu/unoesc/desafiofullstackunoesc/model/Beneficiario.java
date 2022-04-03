package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Beneficiario extends AbstractEntity {

	private String cpfFormatado;
	
	@JsonIgnore
	private String nis;
	
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
