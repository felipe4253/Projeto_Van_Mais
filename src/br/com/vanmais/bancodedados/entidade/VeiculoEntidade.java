/**
 * 
 */
package br.com.vanmais.bancodedados.entidade;

import java.util.Date;
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
	
	@Column(name="plac_veic", unique=true, nullable=false)
	private String placaVeiculo;
	
	@Column(name="ano_veic")
	private Integer anoVeiculo;
	
	@Column(name="mod_veic")
	private String modVeiculo;
	
	@Column(name="wifi", nullable=false)
	private boolean wifi;
	
	@Column(name="ar_cond", nullable=false)
	private boolean arCondicionado;
	
	@Column(name="tv_veic", nullable=false)
	private boolean tv;
	
	@Column(name="sit_veic", nullable=true, columnDefinition="varchar(255) default 'ATIVO'")
	private String sitVeiculo;
	
	@Column(name="dat_incl_veic", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date datInclVeic;
	
// Relacionamento Com Outras Tabelas
	
	@OneToMany(mappedBy="veiculo", fetch=FetchType.LAZY)
	private List<ItinerarioEntidade> itinerarios;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_tipo", nullable=false)
	private TipoVeiculoEntidade tipoVeiculo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_marca", nullable=false)
	private MarcaVeiculoEntidade marca;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_mot", nullable=false)
	private MotoristaEntidade motorista;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	public String getModVeiculo() {
		return modVeiculo;
	}

	public void setModVeiculo(String modVeiculo) {
		this.modVeiculo = modVeiculo;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public String getSitVeiculo() {
		return sitVeiculo;
	}

	public void setSitVeiculo(String sitVeiculo) {
		this.sitVeiculo = sitVeiculo;
	}

	public Date getDatInclVeic() {
		return datInclVeic;
	}

	public void setDatInclVeic(Date datInclVeic) {
		this.datInclVeic = datInclVeic;
	}

	public List<ItinerarioEntidade> getItinerarios() {
		return itinerarios;
	}

	public void setItinerarios(List<ItinerarioEntidade> itinerarios) {
		this.itinerarios = itinerarios;
	}

	public TipoVeiculoEntidade getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculoEntidade tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public MarcaVeiculoEntidade getMarca() {
		return marca;
	}

	public void setMarca(MarcaVeiculoEntidade marca) {
		this.marca = marca;
	}

	public MotoristaEntidade getMotorista() {
		return motorista;
	}

	public void setMotorista(MotoristaEntidade motorista) {
		this.motorista = motorista;
	}

	@Override
	public String toString() {
		return "VeiculoEntidade [id=" + id + ", placaVeiculo=" + placaVeiculo
				+ ", anoVeiculo=" + anoVeiculo + ", modVeiculo=" + modVeiculo
				+ ", wifi=" + wifi + ", arCondicionado=" + arCondicionado
				+ ", tv=" + tv + ", sitVeiculo=" + sitVeiculo
				+ ", datInclVeic=" + datInclVeic + ", itinerarios="
				+ itinerarios + ", tipoVeiculo=" + tipoVeiculo + ", marca="
				+ marca + ", motorista=" + motorista + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anoVeiculo == null) ? 0 : anoVeiculo.hashCode());
		result = prime * result + (arCondicionado ? 1231 : 1237);
		result = prime * result
				+ ((datInclVeic == null) ? 0 : datInclVeic.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((itinerarios == null) ? 0 : itinerarios.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result
				+ ((modVeiculo == null) ? 0 : modVeiculo.hashCode());
		result = prime * result
				+ ((motorista == null) ? 0 : motorista.hashCode());
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
		if (itinerarios == null) {
			if (other.itinerarios != null)
				return false;
		} else if (!itinerarios.equals(other.itinerarios))
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
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
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

	
		
}
