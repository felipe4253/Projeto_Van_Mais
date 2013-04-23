/**
 * 
 */
package br.com.vanmais.bancodedados.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="tipo_veiculo")
public class TipoVeiculoEntidade {
	
	@Id
	@Column(name="cod_tipo", nullable=false, updatable=false, insertable=false)
	@GeneratedValue 
	private Long id;
	
	@Column(name="desc_tipo")
	private String descTipoVeiculo;
	
	@OneToMany(mappedBy="tipoVeiculo", fetch = FetchType.LAZY)
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
	 * @return the descTipoVeiculo
	 */
	public String getDescTipoVeiculo() {
		return descTipoVeiculo;
	}

	/**
	 * @param descTipoVeiculo the descTipoVeiculo to set
	 */
	public void setDescTipoVeiculo(String descTipoVeiculo) {
		this.descTipoVeiculo = descTipoVeiculo;
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
				+ ((descTipoVeiculo == null) ? 0 : descTipoVeiculo.hashCode());
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
		TipoVeiculoEntidade other = (TipoVeiculoEntidade) obj;
		if (descTipoVeiculo == null) {
			if (other.descTipoVeiculo != null)
				return false;
		} else if (!descTipoVeiculo.equals(other.descTipoVeiculo))
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
		return "TipoVeiculoEntidade [id=" + id + ", descTipoVeiculo="
				+ descTipoVeiculo + ", veiculos=" + veiculos + "]";
	}
	
	
	
	
	
}
