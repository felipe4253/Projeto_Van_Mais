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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="tipo_instituicao")
public class TipoInstituicaoEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_tipo_inst")
	private Long codTipo;
	
	@Column(name="desc_tipo_inst")
	private String descricao;
	
	@OneToMany(mappedBy="tipoInstituicao",fetch=FetchType.LAZY)
	private List<InstituicaoEntidade> instituicoes;

	/**
	 * @return the codTipo
	 */
	public Long getCodTipo() {
		return codTipo;
	}

	/**
	 * @param codTipo the codTipo to set
	 */
	public void setCodTipo(Long codTipo) {
		this.codTipo = codTipo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the instituicoes
	 */
	public List<InstituicaoEntidade> getInstituicoes() {
		return instituicoes;
	}

	/**
	 * @param instituicoes the instituicoes to set
	 */
	public void setInstituicoes(List<InstituicaoEntidade> instituicoes) {
		this.instituicoes = instituicoes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codTipo == null) ? 0 : codTipo.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
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
		TipoInstituicaoEntidade other = (TipoInstituicaoEntidade) obj;
		if (codTipo == null) {
			if (other.codTipo != null)
				return false;
		} else if (!codTipo.equals(other.codTipo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoInstituicaoEntidade [codTipo=" + codTipo + ", descricao="
				+ descricao + "]";
	}
	
	
}
