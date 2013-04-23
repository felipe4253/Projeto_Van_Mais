/**
 * 
 */
package br.com.vanmais.bancodedados.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="bairro")
public class BairroEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codBairro;
	
	@Column(name="desc_bairro")
	private String descBairro;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_regiao")
	private RegiaoEntidade regiao;
	
	//TODO - Adicionar as listas das entidades que fazem referencia a esta entidade

	/**
	 * @return the codBairro
	 */
	public Long getCodBairro() {
		return codBairro;
	}

	/**
	 * @param codBairro the codBairro to set
	 */
	public void setCodBairro(Long codBairro) {
		this.codBairro = codBairro;
	}

	/**
	 * @return the descBairro
	 */
	public String getDescBairro() {
		return descBairro;
	}

	/**
	 * @param descBairro the descBairro to set
	 */
	public void setDescBairro(String descBairro) {
		this.descBairro = descBairro;
	}

	/**
	 * @return the regiao
	 */
	public RegiaoEntidade getRegiao() {
		return regiao;
	}

	/**
	 * @param regiao the regiao to set
	 */
	public void setRegiao(RegiaoEntidade regiao) {
		this.regiao = regiao;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BairroEntidade [codBairro=" + codBairro + ", descBairro="
				+ descBairro + ", regiao=" + regiao + "]";
	}
	
	
}
