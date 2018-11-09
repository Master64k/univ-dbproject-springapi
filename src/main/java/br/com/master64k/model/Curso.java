package br.com.master64k.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso implements Serializable {

	/**
	 * Classe bean :
	 * Deve conter um construtor vazio
	 * Deve conter um metodo hash e um equals
	 * Deve ter os metodos get e set
	 * implementar serializable
	 * as anotações com @ são do JPA
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COD_CURSO")
	private Integer codigo;
	
	@Column(name="NOME_CURSO")
	private String nome;
	
	@Column(name="DURACAO_CURSO")
	private String duracao;
	
	@Column(name="MENS_CURSO")
	private Double mensalidade;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}

	