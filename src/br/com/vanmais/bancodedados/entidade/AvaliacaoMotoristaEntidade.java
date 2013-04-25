/**
 * 
 */
package br.com.vanmais.bancodedados.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name = "avaliacao_motorista")
public class AvaliacaoMotoristaEntidade {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_avaliacao")
	private Long Id;
	
	@Column(name="niv_avaliacao")
	private Integer nivelAvaliacao;
	
	@Column(name="desc_aval", length = 900)
	private String descricaoAvaliacao;
	
	@Column(name="sit_aval", nullable=true, columnDefinition="varchar(255) default 'ATIVO'")
	private String sitAvaliacao;
	
	//RELACIONAMENTO COM OUTRAS TABELAS
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_mot", nullable=false)
	private MotoristaEntidade motorista;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_usu", nullable=false)
	private UsuarioClienteEntidade usuario;

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the nivelAvaliacao
	 */
	public Integer getNivelAvaliacao() {
		return nivelAvaliacao;
	}

	/**
	 * @param nivelAvaliacao the nivelAvaliacao to set
	 */
	public void setNivelAvaliacao(Integer nivelAvaliacao) {
		this.nivelAvaliacao = nivelAvaliacao;
	}

	/**
	 * @return the descricaoAvaliacao
	 */
	public String getDescricaoAvaliacao() {
		return descricaoAvaliacao;
	}

	/**
	 * @param descricaoAvaliacao the descricaoAvaliacao to set
	 */
	public void setDescricaoAvaliacao(String descricaoAvaliacao) {
		this.descricaoAvaliacao = descricaoAvaliacao;
	}

	/**
	 * @return the sitAvaliacao
	 */
	public String getSitAvaliacao() {
		return sitAvaliacao;
	}

	/**
	 * @param sitAvaliacao the sitAvaliacao to set
	 */
	public void setSitAvaliacao(String sitAvaliacao) {
		this.sitAvaliacao = sitAvaliacao;
	}

	/**
	 * @return the motorista
	 */
	public MotoristaEntidade getMotorista() {
		return motorista;
	}

	/**
	 * @param motorista the motorista to set
	 */
	public void setMotorista(MotoristaEntidade motorista) {
		this.motorista = motorista;
	}

	/**
	 * @return the usuario
	 */
	public UsuarioClienteEntidade getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioClienteEntidade usuario) {
		this.usuario = usuario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AvaliacaoMotoristaEntidade [Id=" + Id + ", nivelAvaliacao="
				+ nivelAvaliacao + ", descricaoAvaliacao=" + descricaoAvaliacao
				+ ", sitAvaliacao=" + sitAvaliacao + ", motorista=" + motorista
				+ ", usuario=" + usuario + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime
				* result
				+ ((descricaoAvaliacao == null) ? 0 : descricaoAvaliacao
						.hashCode());
		result = prime * result
				+ ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result
				+ ((nivelAvaliacao == null) ? 0 : nivelAvaliacao.hashCode());
		result = prime * result
				+ ((sitAvaliacao == null) ? 0 : sitAvaliacao.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		AvaliacaoMotoristaEntidade other = (AvaliacaoMotoristaEntidade) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (descricaoAvaliacao == null) {
			if (other.descricaoAvaliacao != null)
				return false;
		} else if (!descricaoAvaliacao.equals(other.descricaoAvaliacao))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (nivelAvaliacao == null) {
			if (other.nivelAvaliacao != null)
				return false;
		} else if (!nivelAvaliacao.equals(other.nivelAvaliacao))
			return false;
		if (sitAvaliacao == null) {
			if (other.sitAvaliacao != null)
				return false;
		} else if (!sitAvaliacao.equals(other.sitAvaliacao))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	
	
}
