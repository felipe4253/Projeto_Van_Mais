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
@Table(name="estado")
public class EstadoEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_estado")
	private Long codEstado;
	
	@Column(name="desc_estado")
	private String descEstado;
	
	@OneToMany(mappedBy="estado", fetch=FetchType.LAZY)
	private List<CidadeEntidade> cidades;

	/**
	 * @return the codEstado
	 */
	public Long getCodEstado() {
		return codEstado;
	}

	/**
	 * @param codEstado the codEstado to set
	 */
	public void setCodEstado(Long codEstado) {
		this.codEstado = codEstado;
	}

	/**
	 * @return the descEstado
	 */
	public String getDescEstado() {
		return descEstado;
	}

	/**
	 * @param descEstado the descEstado to set
	 */
	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

	/**
	 * @return the cidades
	 */
	public List<CidadeEntidade> getCidades() {
		return cidades;
	}

	/**
	 * @param cidades the cidades to set
	 */
	public void setCidades(List<CidadeEntidade> cidades) {
		this.cidades = cidades;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidades == null) ? 0 : cidades.hashCode());
		result = prime * result
				+ ((codEstado == null) ? 0 : codEstado.hashCode());
		result = prime * result
				+ ((descEstado == null) ? 0 : descEstado.hashCode());
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
		EstadoEntidade other = (EstadoEntidade) obj;
		if (cidades == null) {
			if (other.cidades != null)
				return false;
		} else if (!cidades.equals(other.cidades))
			return false;
		if (codEstado == null) {
			if (other.codEstado != null)
				return false;
		} else if (!codEstado.equals(other.codEstado))
			return false;
		if (descEstado == null) {
			if (other.descEstado != null)
				return false;
		} else if (!descEstado.equals(other.descEstado))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EstadoEntidade [codEstado=" + codEstado + ", descEstado="
				+ descEstado + ", cidades=" + cidades + "]";
	}
	
	
	
}
