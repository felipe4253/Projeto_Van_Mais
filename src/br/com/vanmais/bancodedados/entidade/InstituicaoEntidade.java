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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="instituicao")
public class InstituicaoEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_inst")
	private Long codInst;
	
	@Column(name="nom_inst")
	private String nome;
	
	@Column(name="logr_inst", unique=true)
	private String logradouroInst;
	
//RELACIONAMENTO COM OUTRAS TABELAS
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_tipo_inst", nullable=false)
	private TipoInstituicaoEntidade tipoInstituicao;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_bairro", nullable=false)
	private BairroEntidade bairro;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="itinerario_instituicoes", 
		joinColumns = { @JoinColumn(name = "cod_inst") },
		inverseJoinColumns = { @JoinColumn (name="cod_iti")}	)
	private List<ItinerarioEntidade> itinerarios;

	/**
	 * @return the codInst
	 */
	public Long getCodInst() {
		return codInst;
	}

	/**
	 * @param codInst the codInst to set
	 */
	public void setCodInst(Long codInst) {
		this.codInst = codInst;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the logradouroInst
	 */
	public String getLogradouroInst() {
		return logradouroInst;
	}

	/**
	 * @param logradouroInst the logradouroInst to set
	 */
	public void setLogradouroInst(String logradouroInst) {
		this.logradouroInst = logradouroInst;
	}

	/**
	 * @return the tipoInstituicao
	 */
	public TipoInstituicaoEntidade getTipoInstituicao() {
		return tipoInstituicao;
	}

	/**
	 * @param tipoInstituicao the tipoInstituicao to set
	 */
	public void setTipoInstituicao(TipoInstituicaoEntidade tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}

	/**
	 * @return the bairro
	 */
	public BairroEntidade getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(BairroEntidade bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the itinerarios
	 */
	public List<ItinerarioEntidade> getItinerarios() {
		return itinerarios;
	}

	/**
	 * @param itinerarios the itinerarios to set
	 */
	public void setItinerarios(List<ItinerarioEntidade> itinerarios) {
		this.itinerarios = itinerarios;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InstituicaoEntidade [codInst=" + codInst + ", nome=" + nome
				+ ", logradouroInst=" + logradouroInst + ", tipoInstituicao="
				+ tipoInstituicao + ", bairro=" + bairro + ", itinerarios="
				+ itinerarios + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((codInst == null) ? 0 : codInst.hashCode());
		result = prime * result
				+ ((itinerarios == null) ? 0 : itinerarios.hashCode());
		result = prime * result
				+ ((logradouroInst == null) ? 0 : logradouroInst.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((tipoInstituicao == null) ? 0 : tipoInstituicao.hashCode());
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
		InstituicaoEntidade other = (InstituicaoEntidade) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (codInst == null) {
			if (other.codInst != null)
				return false;
		} else if (!codInst.equals(other.codInst))
			return false;
		if (itinerarios == null) {
			if (other.itinerarios != null)
				return false;
		} else if (!itinerarios.equals(other.itinerarios))
			return false;
		if (logradouroInst == null) {
			if (other.logradouroInst != null)
				return false;
		} else if (!logradouroInst.equals(other.logradouroInst))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoInstituicao == null) {
			if (other.tipoInstituicao != null)
				return false;
		} else if (!tipoInstituicao.equals(other.tipoInstituicao))
			return false;
		return true;
	}
	

	
}
