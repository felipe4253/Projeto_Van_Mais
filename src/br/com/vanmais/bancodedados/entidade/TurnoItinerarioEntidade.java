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
@Table(name="turno_itinerario")
public class TurnoItinerarioEntidade {
	
	@Id
	@Column(name="cod_turno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="desc_turno")
	private String descTipoVeiculo;
	
	//Relacionamento com outras tabelas
	
	@OneToMany(mappedBy="turnoItinerario", fetch = FetchType.LAZY)
	private List<ItinerarioEntidade> itinerarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescTipoVeiculo() {
		return descTipoVeiculo;
	}

	public void setDescTipoVeiculo(String descTipoVeiculo) {
		this.descTipoVeiculo = descTipoVeiculo;
	}

	public List<ItinerarioEntidade> getItinerarios() {
		return itinerarios;
	}

	public void setItinerarios(List<ItinerarioEntidade> itinerarios) {
		this.itinerarios = itinerarios;
	}

	@Override
	public String toString() {
		return "TurnoItinerarioEntidade [id=" + id + ", descTipoVeiculo="
				+ descTipoVeiculo + ", itinerarios=" + itinerarios + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descTipoVeiculo == null) ? 0 : descTipoVeiculo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((itinerarios == null) ? 0 : itinerarios.hashCode());
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
		TurnoItinerarioEntidade other = (TurnoItinerarioEntidade) obj;
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
		if (itinerarios == null) {
			if (other.itinerarios != null)
				return false;
		} else if (!itinerarios.equals(other.itinerarios))
			return false;
		return true;
	}
	
	
	
}
