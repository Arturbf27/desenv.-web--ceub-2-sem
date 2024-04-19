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
@Table(name = "curriculo")
public class Curriculo {

		@Id  //chaveprimaria
		@GeneratedValue(strategy=GenerationType.IDENTITY) // ordenação
		
		@Column(name = "Codigo", unique = true, nullable = false) 
		private Integer id;
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "data_de_nascimento")
		private String datadenascimento;
		
		@Column(name = "endereco")
		private String endereco;
		
		@Column(name = "cep")
		private String cep;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "formacao")
		private String formacao;
		
		@Column(name = "empresa1")
		private String empresa1;
		
		@Column(name = "de1")
		private String de;
		
		@Column(name = "ate1")
		private String ate1;
		
		@Column(name = "empresa2")
		private String empresa2;
		
		@Column(name = "de2")
		private String de2;
		
		@Column(name = "ate2")
		private String ate2;
		
		@Column(name = "habilidades")
		private String habilidades;
}
