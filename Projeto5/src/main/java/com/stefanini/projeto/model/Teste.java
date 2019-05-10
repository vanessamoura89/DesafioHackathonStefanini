package com.stefanini.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Teste implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SQ_TE_NU", sequenceName = "SQ_TE_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TE_NU")
	@Column(name = "TE_NU")
	private Long id;

	@Column(name = "TE_ANO_NASCIMENTO")
	private Integer anoNascimento;

	@Column(name = "TE_ANO_DESEJADO")
	private Integer anoDesejado;
	
	@Column(name = "TE_CALCULAR")
	private Integer calcular;

	@ManyToOne
	@com.fasterxml.jackson.annotation.JsonIgnore
	@JoinColumn(name = "CO_NU", referencedColumnName = "CO_NU")
	private Codigo codigo;

	public Teste() {
		super();
	}

	public Teste( Integer anoNascimento, Integer anoDesejado, Integer calcular ) {
		super();
		this.anoNascimento = anoNascimento;
		this.anoDesejado = anoDesejado;
		this.calcular = calcular;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Codigo getCodigo() {
		return codigo;
	}

	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public Integer getAnoDesejado() {
		return anoDesejado;
	}

	public void setAnoDesejado(Integer anoDesejado) {
		this.anoDesejado = anoDesejado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teste other = (Teste) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}