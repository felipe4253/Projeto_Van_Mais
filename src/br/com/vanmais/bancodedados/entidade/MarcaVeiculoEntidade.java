/**
 * 
 */
package br.com.vanmais.bancodedados.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="marca_veiculo")
public class MarcaVeiculoEntidade {
	
	@Id
	@GeneratedValue()
	@Column(name="cod_marca",nullable=false)
	private Long id;
	
	@Column(name="desc_marca")
	private String descMarca;
	
	@OneToMany()
	private List<VeiculoEntidade> veiculos;
	
//GETTERS e SETTERS
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the descMarca
	 */
	public String getDescMarca() {
		return descMarca;
	}

	/**
	 * @param descMarca the descMarca to set
	 */
	public void setDescMarca(String descMarca) {
		this.descMarca = descMarca;
	}

	/**
	 * @return the veiculos
	 */
	public List<VeiculoEntidade> getVeiculos() {
		return veiculos;
	}

	/**
	 * @param veiculos the veiculos to set
	 */
	public void setVeiculos(List<VeiculoEntidade> veiculos) {
		this.veiculos = veiculos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descMarca == null) ? 0 : descMarca.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((veiculos == null) ? 0 : veiculos.hashCode());
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
		MarcaVeiculoEntidade other = (MarcaVeiculoEntidade) obj;
		if (descMarca == null) {
			if (other.descMarca != null)
				return false;
		} else if (!descMarca.equals(other.descMarca))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (veiculos == null) {
			if (other.veiculos != null)
				return false;
		} else if (!veiculos.equals(other.veiculos))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MarcaVeiculoEntidade [id=" + id + ", descMarca=" + descMarca
				+ ", veiculos=" + veiculos + "]";
	}
	
}
