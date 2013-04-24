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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="usuario_cliente")
public class UsuarioClienteEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_usu")
	private Long id;
	
	@Column(name="nome_usu")
	private String nome;
	
	@Column(name="cpf_usu")
	private Long cpf;
	
	@Column(name="email_usu",nullable=false, unique=true)
	private String emailUsuario;
	
	@Column(name="tel_usu")
	private String telUsuario;
	
	@Column(name="hash_senh",nullable=false)
	private String hashSenha;
	
	@Column(name="dat_incl_usu", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date datInclUsu;
	
	@Column(name="sit_usu", nullable=true, columnDefinition="varchar(255) default 'ATIVO'")
	private String sitUsuario;
	
	//RELACIONAMENTO COM OUTRAS TABELAS
	
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	private List<AvaliacaoMotoristaEntidade> avaliacoes;

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
	 * @return the cpf
	 */
	public Long getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the emailUsuario
	 */
	public String getEmailUsuario() {
		return emailUsuario;
	}

	/**
	 * @param emailUsuario the emailUsuario to set
	 */
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	/**
	 * @return the telUsuario
	 */
	public String getTelUsuario() {
		return telUsuario;
	}

	/**
	 * @param telUsuario the telUsuario to set
	 */
	public void setTelUsuario(String telUsuario) {
		this.telUsuario = telUsuario;
	}

	/**
	 * @return the hashSenha
	 */
	public String getHashSenha() {
		return hashSenha;
	}

	/**
	 * @param hashSenha the hashSenha to set
	 */
	public void setHashSenha(String hashSenha) {
		this.hashSenha = hashSenha;
	}

	/**
	 * @return the datInclUsu
	 */
	public Date getDatInclUsu() {
		return datInclUsu;
	}

	/**
	 * @param datInclUsu the datInclUsu to set
	 */
	public void setDatInclUsu(Date datInclUsu) {
		this.datInclUsu = datInclUsu;
	}

	/**
	 * @return the sitUsuario
	 */
	public String getSitUsuario() {
		return sitUsuario;
	}

	/**
	 * @param sitUsuario the sitUsuario to set
	 */
	public void setSitUsuario(String sitUsuario) {
		this.sitUsuario = sitUsuario;
	}

	/**
	 * @return the avaliacoes
	 */
	public List<AvaliacaoMotoristaEntidade> getAvaliacoes() {
		return avaliacoes;
	}

	/**
	 * @param avaliacoes the avaliacoes to set
	 */
	public void setAvaliacoes(List<AvaliacaoMotoristaEntidade> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UsuarioClienteEntidade [id=" + id + ", nome=" + nome + ", cpf="
				+ cpf + ", emailUsuario=" + emailUsuario + ", telUsuario="
				+ telUsuario + ", hashSenha=" + hashSenha + ", datInclUsu="
				+ datInclUsu + ", sitUsuario=" + sitUsuario + ", avaliacoes="
				+ avaliacoes + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((avaliacoes == null) ? 0 : avaliacoes.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((datInclUsu == null) ? 0 : datInclUsu.hashCode());
		result = prime * result
				+ ((emailUsuario == null) ? 0 : emailUsuario.hashCode());
		result = prime * result
				+ ((hashSenha == null) ? 0 : hashSenha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((sitUsuario == null) ? 0 : sitUsuario.hashCode());
		result = prime * result
				+ ((telUsuario == null) ? 0 : telUsuario.hashCode());
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
		UsuarioClienteEntidade other = (UsuarioClienteEntidade) obj;
		if (avaliacoes == null) {
			if (other.avaliacoes != null)
				return false;
		} else if (!avaliacoes.equals(other.avaliacoes))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (datInclUsu == null) {
			if (other.datInclUsu != null)
				return false;
		} else if (!datInclUsu.equals(other.datInclUsu))
			return false;
		if (emailUsuario == null) {
			if (other.emailUsuario != null)
				return false;
		} else if (!emailUsuario.equals(other.emailUsuario))
			return false;
		if (hashSenha == null) {
			if (other.hashSenha != null)
				return false;
		} else if (!hashSenha.equals(other.hashSenha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sitUsuario == null) {
			if (other.sitUsuario != null)
				return false;
		} else if (!sitUsuario.equals(other.sitUsuario))
			return false;
		if (telUsuario == null) {
			if (other.telUsuario != null)
				return false;
		} else if (!telUsuario.equals(other.telUsuario))
			return false;
		return true;
	}
	
	
	

	
}







