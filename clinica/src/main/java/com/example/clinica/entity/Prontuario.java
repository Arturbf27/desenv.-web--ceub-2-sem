package com.example.clinica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "prontuario")
public class Prontuario {

	@Id  //chaveprimaria
	@GeneratedValue(strategy=GenerationType.IDENTITY) // ordenação
	@Column(name = "Codigo", unique = true, nullable = false) 
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "nome_da_mae")
	private String nomedamae;

	@Column(name = "nome_do_pai")
	private String nomedopai;
	
	@Column(name = "telefone_do_pai")
	private String telefonedopai;
	
	@Column(name = "telefone_da_mae")
	private String telefonedamae;
	
	@Column(name = "informante")
	private String informante;
	
	@Column(name = "queixa")
	private String queixa;
	
	@Column(name = "informacoes")
	private String informacoes;
	
	@Column(name = "comorbidades")
	private String comorbidades;

	@Column(name = "historico_familiar")
	private String historico_familiar;
	
}