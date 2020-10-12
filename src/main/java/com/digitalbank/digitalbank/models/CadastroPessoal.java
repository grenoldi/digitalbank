package com.digitalbank.digitalbank.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="clientes")
public class CadastroPessoal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@Column(name="last_name")
	private String surName;
	
	@NotNull
	@Column(name="date_of_birth")
	private String birthDate;
	
	@NotNull
	@Column(name="e_mail")
	private String email;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cpf_id")	
	private long cpf;
	
	public String getName() {
		return firstName;
	}
	
	public void setNome(String nome) {
		this.firstName = nome;
	}
	
	public String getSobrenome() {
		return surName;
	}
	
	public void setSobrenome(String sobrenome) {
		this.surName = sobrenome;
	}
	
	public String getData() {
		return birthDate;
	}
	
	public void setData(String data) {
		this.birthDate = data;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
