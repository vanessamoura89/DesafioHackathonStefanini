package com.stefanini.projeto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.stefanini.projeto.enums.SituacaoEnum;

@Entity
public class Codigo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SQ_CO_NU", sequenceName = "SQ_CO_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CO_NU")
	@Column(name = "CO_NU")
	public Long codigoId;

	@Column(name = "CO_NO")
	public String nome;

	@Column(name = "CO_SIT")
	@Enumerated(EnumType.STRING)
	public SituacaoEnum situacao;

	@OneToMany(mappedBy = "codigo")
	public List<Teste> testes;

	public List<Teste> Teste;

	public Codigo() {
		super();
	}

	public Codigo(Long id, String nome, SituacaoEnum situacao) {
		super();
		this.codigoId = id;
		this.nome = nome;
		this.situacao = situacao;
	}

	public Long getCodigoId() {
		return codigoId;
	}

	public void setCodigoId(Long id) {
		this.codigoId = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoEnum situacao) {
		this.situacao = situacao;
	}
	
	public List<Teste> getTeste() {
		return testes;
	}

	public void setTeste(List<Teste>teste) {
		this.Teste = teste;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoId == null) ? 0 : codigoId.hashCode());
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
		Codigo other = (Codigo) obj;
		if (codigoId == null) {
			if (other.codigoId != null)
				return false;
		} else if (!codigoId.equals(other.codigoId))
			return false;
		return true;
	}

}