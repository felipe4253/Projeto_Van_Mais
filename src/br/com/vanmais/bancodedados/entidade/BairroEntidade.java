/**
 * 
 */
package br.com.vanmais.bancodedados.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */

//TODO Refazer getters e setters, hash equals e toString
@Entity 
@Table(name="bairro")
public class BairroEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_bairro")
	private Long codBairro;
	
	@Column(name="desc_bairro")
	private String descBairro;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_regiao", nullable=false)
	private RegiaoEntidade regiao;
	
	@OneToMany(mappedBy="bairro", fetch=FetchType.LAZY)
	private List<InstituicaoEntidade> instituicoes;

	public Long getCodBairro() {
		return codBairro;
	}

	public void setCodBairro(Long codBairro) {
		this.codBairro = codBairro;
	}

	public String getDescBairro() {
		return descBairro;
	}

	public void setDescBairro(String descBairro) {
		this.descBairro = descBairro;
	}

	public RegiaoEntidade getRegiao() {
		return regiao;
	}

	public void setRegiao(RegiaoEntidade regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "BairroEntidade [codBairro=" + codBairro + ", descBairro="
				+ descBairro + ", regiao=" + regiao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codBairro == null) ? 0 : codBairro.hashCode());
		result = prime * result
				+ ((descBairro == null) ? 0 : descBairro.hashCode());
		result = prime * result + ((regiao == null) ? 0 : regiao.hashCode());
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
		BairroEntidade other = (BairroEntidade) obj;
		if (codBairro == null) {
			if (other.codBairro != null)
				return false;
		} else if (!codBairro.equals(other.codBairro))
			return false;
		if (descBairro == null) {
			if (other.descBairro != null)
				return false;
		} else if (!descBairro.equals(other.descBairro))
			return false;
		if (regiao == null) {
			if (other.regiao != null)
				return false;
		} else if (!regiao.equals(other.regiao))
			return false;
		return true;
	}
	
	//TODO - Adicionar as listas das entidades que fazem referencia a esta entidade

}