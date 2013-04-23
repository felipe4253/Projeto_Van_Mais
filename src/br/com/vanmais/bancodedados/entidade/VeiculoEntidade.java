/**
 * 
 */
package br.com.vanmais.bancodedados.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="veiculo")
public class VeiculoEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_veic", nullable=false, updatable=false, insertable=false)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_marca", nullable=false)
	private MarcaVeiculoEntidade marca;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_tipo", nullable=false)
	private TipoVeiculoEntidade tipoVeiculo;
	
	@Column(name="plac_veic", unique=true, nullable=false)
	private String placaVeiculo;
	
	@Column(name="ano_veic")
	private Integer anoVeiculo;
	
	@Column(name="cor_veic")
	private String corVeiculo;
	
	@Column(name="mod_veic")
	private String modVeiculo;
	
	@Column(name="wifi", nullable=false)
	private boolean wifi;
	
	@Column(name="ar_cond", nullable=false)
	private boolean arCondicionado;
	
	@Column(name="tv_veic", nullable=false)
	private boolean tv;
	
	@Column(name="sit_veic", nullable=false)
	private String sitVeiculo;
	
	@Column(name="dat_incl_veic", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date datInclVeic;

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
	 * @return the marca
	 */
	public MarcaVeiculoEntidade getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(MarcaVeiculoEntidade marca) {
		this.marca = marca;
	}

	/**
	 * @return the tipoVeiculo
	 */
	public TipoVeiculoEntidade getTipoVeiculo() {
		return tipoVeiculo;
	}

	/**
	 * @param tipoVeiculo the tipoVeiculo to set
	 */
	public void setTipoVeiculo(TipoVeiculoEntidade tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	/**
	 * @return the placaVeiculo
	 */
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	/**
	 * @param placaVeiculo the placaVeiculo to set
	 */
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	/**
	 * @return the anoVeiculo
	 */
	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	/**
	 * @param anoVeiculo the anoVeiculo to set
	 */
	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	/**
	 * @return the corVeiculo
	 */
	public String getCorVeiculo() {
		return corVeiculo;
	}

	/**
	 * @param corVeiculo the corVeiculo to set
	 */
	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}

	/**
	 * @return the modVeiculo
	 */
	public String getModVeiculo() {
		return modVeiculo;
	}

	/**
	 * @param modVeiculo the modVeiculo to set
	 */
	public void setModVeiculo(String modVeiculo) {
		this.modVeiculo = modVeiculo;
	}

	/**
	 * @return the wifi
	 */
	public boolean isWifi() {
		return wifi;
	}

	/**
	 * @param wifi the wifi to set
	 */
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	/**
	 * @return the arCondicionado
	 */
	public boolean isArCondicionado() {
		return arCondicionado;
	}

	/**
	 * @param arCondicionado the arCondicionado to set
	 */
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	/**
	 * @return the tv
	 */
	public boolean isTv() {
		return tv;
	}

	/**
	 * @param tv the tv to set
	 */
	public void setTv(boolean tv) {
		this.tv = tv;
	}

	/**
	 * @return the sitVeiculo
	 */
	public String getSitVeiculo() {
		return sitVeiculo;
	}

	/**
	 * @param sitVeiculo the sitVeiculo to set
	 */
	public void setSitVeiculo(String sitVeiculo) {
		this.sitVeiculo = sitVeiculo;
	}

	/**
	 * @return the datInclVeic
	 */
	public Date getDatInclVeic() {
		return datInclVeic;
	}

	/**
	 * @param datInclVeic the datInclVeic to set
	 */
	public void setDatInclVeic(Date datInclVeic) {
		this.datInclVeic = datInclVeic;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anoVeiculo == null) ? 0 : anoVeiculo.hashCode());
		result = prime * result + (arCondicionado ? 1231 : 1237);
		result = prime * result
				+ ((corVeiculo == null) ? 0 : corVeiculo.hashCode());
		result = prime * result
				+ ((datInclVeic == null) ? 0 : datInclVeic.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result
				+ ((modVeiculo == null) ? 0 : modVeiculo.hashCode());
		result = prime * result
				+ ((placaVeiculo == null) ? 0 : placaVeiculo.hashCode());
		result = prime * result
				+ ((sitVeiculo == null) ? 0 : sitVeiculo.hashCode());
		result = prime * result
				+ ((tipoVeiculo == null) ? 0 : tipoVeiculo.hashCode());
		result = prime * result + (tv ? 1231 : 1237);
		result = prime * result + (wifi ? 1231 : 1237);
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
		VeiculoEntidade other = (VeiculoEntidade) obj;
		if (anoVeiculo == null) {
			if (other.anoVeiculo != null)
				return false;
		} else if (!anoVeiculo.equals(other.anoVeiculo))
			return false;
		if (arCondicionado != other.arCondicionado)
			return false;
		if (corVeiculo == null) {
			if (other.corVeiculo != null)
				return false;
		} else if (!corVeiculo.equals(other.corVeiculo))
			return false;
		if (datInclVeic == null) {
			if (other.datInclVeic != null)
				return false;
		} else if (!datInclVeic.equals(other.datInclVeic))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modVeiculo == null) {
			if (other.modVeiculo != null)
				return false;
		} else if (!modVeiculo.equals(other.modVeiculo))
			return false;
		if (placaVeiculo == null) {
			if (other.placaVeiculo != null)
				return false;
		} else if (!placaVeiculo.equals(other.placaVeiculo))
			return false;
		if (sitVeiculo == null) {
			if (other.sitVeiculo != null)
				return false;
		} else if (!sitVeiculo.equals(other.sitVeiculo))
			return false;
		if (tipoVeiculo == null) {
			if (other.tipoVeiculo != null)
				return false;
		} else if (!tipoVeiculo.equals(other.tipoVeiculo))
			return false;
		if (tv != other.tv)
			return false;
		if (wifi != other.wifi)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VeiculoEntidade [id=" + id + ", marca=" + marca
				+ ", tipoVeiculo=" + tipoVeiculo + ", placaVeiculo="
				+ placaVeiculo + ", anoVeiculo=" + anoVeiculo + ", corVeiculo="
				+ corVeiculo + ", modVeiculo=" + modVeiculo + ", wifi=" + wifi
				+ ", arCondicionado=" + arCondicionado + ", tv=" + tv
				+ ", sitVeiculo=" + sitVeiculo + ", datInclVeic=" + datInclVeic
				+ "]";
	}
	
	
}
