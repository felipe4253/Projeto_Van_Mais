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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="itinerario")
public class ItinerarioEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_iti")
	private Long Id;
	
	@Column(name="desc_iti", length = 700)
	private String descItinerario;
	
	@Column(name="flg_idaVolta") //1 - Somente ida; 2 - Somente Volta; 3 - Ida e Volta
	private int flgIdaVolta;
	
	@Column(name="dat_incl_iti", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date datInclItinerario;
	
	@Column(name="sit_iti", columnDefinition="varchar(255) default 'ATIVO'")
	private String sitItinerario;
	
//Relacionamento com outras tabelas
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="cod_veic", nullable=false)
	private VeiculoEntidade veiculo;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false)
	@JoinColumn(name="cod_mot", nullable=false)
	private MotoristaEntidade motorista;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="itinerario_bairros", 
		joinColumns = { @JoinColumn(name = "cod_iti") },
		inverseJoinColumns = { @JoinColumn (name="cod_bairro")}	)
	private List<BairroEntidade> bairros;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="itinerario_instituicoes", 
		joinColumns = { @JoinColumn(name = "cod_iti") },
		inverseJoinColumns = { @JoinColumn (name="cod_inst")}	)
	private List<InstituicaoEntidade> instituicoes;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_turno", nullable=false)
	private TurnoItinerarioEntidade turnoItinerario;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDescItinerario() {
		return descItinerario;
	}

	public void setDescItinerario(String descItinerario) {
		this.descItinerario = descItinerario;
	}

	public int getFlgIdaVolta() {
		return flgIdaVolta;
	}

	public void setFlgIdaVolta(int flgIdaVolta) {
		this.flgIdaVolta = flgIdaVolta;
	}

	public Date getDatInclItinerario() {
		return datInclItinerario;
	}

	public void setDatInclItinerario(Date datInclItinerario) {
		this.datInclItinerario = datInclItinerario;
	}

	public String getSitItinerario() {
		return sitItinerario;
	}

	public void setSitItinerario(String sitItinerario) {
		this.sitItinerario = sitItinerario;
	}

	public VeiculoEntidade getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(VeiculoEntidade veiculo) {
		this.veiculo = veiculo;
	}

	public MotoristaEntidade getMotorista() {
		return motorista;
	}

	public void setMotorista(MotoristaEntidade motorista) {
		this.motorista = motorista;
	}

	public List<BairroEntidade> getBairros() {
		return bairros;
	}

	public void setBairros(List<BairroEntidade> bairros) {
		this.bairros = bairros;
	}

	public List<InstituicaoEntidade> getInstituicoes() {
		return instituicoes;
	}

	public void setInstituicoes(List<InstituicaoEntidade> instituicoes) {
		this.instituicoes = instituicoes;
	}

	public TurnoItinerarioEntidade getTurnoItinerario() {
		return turnoItinerario;
	}

	public void setTurnoItinerario(TurnoItinerarioEntidade turnoItinerario) {
		this.turnoItinerario = turnoItinerario;
	}

	@Override
	public String toString() {
		return "ItinerarioEntidade [Id=" + Id + ", descItinerario="
				+ descItinerario + ", flgIdaVolta=" + flgIdaVolta
				+ ", datInclItinerario=" + datInclItinerario
				+ ", sitItinerario=" + sitItinerario + ", veiculo=" + veiculo
				+ ", motorista=" + motorista + ", bairros=" + bairros
				+ ", instituicoes=" + instituicoes + ", turnoItinerario="
				+ turnoItinerario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((bairros == null) ? 0 : bairros.hashCode());
		result = prime
				* result
				+ ((datInclItinerario == null) ? 0 : datInclItinerario
						.hashCode());
		result = prime * result
				+ ((descItinerario == null) ? 0 : descItinerario.hashCode());
		result = prime * result + flgIdaVolta;
		result = prime * result
				+ ((instituicoes == null) ? 0 : instituicoes.hashCode());
		result = prime * result
				+ ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result
				+ ((sitItinerario == null) ? 0 : sitItinerario.hashCode());
		result = prime * result
				+ ((turnoItinerario == null) ? 0 : turnoItinerario.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
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
		ItinerarioEntidade other = (ItinerarioEntidade) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (bairros == null) {
			if (other.bairros != null)
				return false;
		} else if (!bairros.equals(other.bairros))
			return false;
		if (datInclItinerario == null) {
			if (other.datInclItinerario != null)
				return false;
		} else if (!datInclItinerario.equals(other.datInclItinerario))
			return false;
		if (descItinerario == null) {
			if (other.descItinerario != null)
				return false;
		} else if (!descItinerario.equals(other.descItinerario))
			return false;
		if (flgIdaVolta != other.flgIdaVolta)
			return false;
		if (instituicoes == null) {
			if (other.instituicoes != null)
				return false;
		} else if (!instituicoes.equals(other.instituicoes))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (sitItinerario == null) {
			if (other.sitItinerario != null)
				return false;
		} else if (!sitItinerario.equals(other.sitItinerario))
			return false;
		if (turnoItinerario == null) {
			if (other.turnoItinerario != null)
				return false;
		} else if (!turnoItinerario.equals(other.turnoItinerario))
			return false;
		if (veiculo == null) {
			if (other.veiculo != null)
				return false;
		} else if (!veiculo.equals(other.veiculo))
			return false;
		return true;
	}

	
		
	
	

}
