package com.digitalbank.digitalbank.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="enderecos")
public class CadastroEndereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cpf_id")
	private long cpf;
	
	@NotNull
	@Column(name="cep")
	private String cep;
	
	@NotNull
	@Column(name="rua")
	private String rua;
	
	@NotNull
	@Column(name="bairro")
	private String bairro;
	
	@NotNull
	@Column(name="complemento")
	private String complemento;
	
	@NotNull
	@Column(name="cidade")
	private String cidade;
	
	@NotNull
	@Column(name="estado")
	private String estado;
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
