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
@Entity
@Table(name="cidade")
public class CidadeEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codCidade;
	
	@Column(name="desc_cidade")
	private String descCidade;
	
	@OneToMany(mappedBy="cidade", fetch=FetchType.LAZY)
	private List<RegiaoEntidade> regioes;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_estado")
	private EstadoEntidade estado;

	/**
	 * @return the codCidade
	 */
	public Long getCodCidade() {
		return codCidade;
	}

	/**
	 * @param codCidade the codCidade to set
	 */
	public void setCodCidade(Long codCidade) {
		this.codCidade = codCidade;
	}

	/**
	 * @return the descCidade
	 */
	public String getDescCidade() {
		return descCidade;
	}

	/**
	 * @param descCidade the descCidade to set
	 */
	public void setDescCidade(String descCidade) {
		this.descCidade = descCidade;
	}

	/**
	 * @return the regioes
	 */
	public List<RegiaoEntidade> getRegioes() {
		return regioes;
	}

	/**
	 * @param regioes the regioes to set
	 */
	public void setRegioes(List<RegiaoEntidade> regioes) {
		this.regioes = regioes;
	}

	/**
	 * @return the estado
	 */
	public EstadoEntidade getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoEntidade estado) {
		this.estado = estado;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codCidade == null) ? 0 : codCidade.hashCode());
		result = prime * result
				+ ((descCidade == null) ? 0 : descCidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((regioes == null) ? 0 : regioes.hashCode());
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
		CidadeEntidade other = (CidadeEntidade) obj;
		if (codCidade == null) {
			if (other.codCidade != null)
				return false;
		} else if (!codCidade.equals(other.codCidade))
			return false;
		if (descCidade == null) {
			if (other.descCidade != null)
				return false;
		} else if (!descCidade.equals(other.descCidade))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (regioes == null) {
			if (other.regioes != null)
				return false;
		} else if (!regioes.equals(other.regioes))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CidadeEntidade [codCidade=" + codCidade + ", descCidade="
				+ descCidade + ", regioes=" + regioes + ", estado=" + estado
				+ "]";
	}
	
	
	
}
