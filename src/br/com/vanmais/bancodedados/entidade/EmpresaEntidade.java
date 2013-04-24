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
@Table(name="empresa")
public class EmpresaEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_empr")
	private Long id;
	
	@Column(name="raz_soc")
	private String razaoSocial; //Nome da empresa
	
	@Column(name="cnpj_empr")
	private String cnpj;
	
	@Column(name="email_empr")
	private String emailEmpresa;
	
	@Column(name="site_empr")
	private String siteEmpresa;
	
	@Column(name="tel_empr")
	private Long telEmpresa;
	
	@Column(name="nom_repr_empr")
	private String nomeRepresentante;
	
	@Column(name="email_repr_empr")
	private String emailRepresentante;
	
	@Column(name="hash_senh_repr")
	private String hashSenhaRepresentante;
	
	@Column(name="sit_empr", nullable=true, columnDefinition="varchar(255) default 'ATIVO'")
	private String sitEmpresa;
	
	@Column(name="dat_incl_empr", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date datInclEmpr;
	
	//RELACIONAMENTO COM OUTRAS TABELAS
	
	@OneToMany(mappedBy="empresa", fetch=FetchType.LAZY)
	private List<MotoristaEntidade> motoristas;

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
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the emailEmpresa
	 */
	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	/**
	 * @param emailEmpresa the emailEmpresa to set
	 */
	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	/**
	 * @return the siteEmpresa
	 */
	public String getSiteEmpresa() {
		return siteEmpresa;
	}

	/**
	 * @param siteEmpresa the siteEmpresa to set
	 */
	public void setSiteEmpresa(String siteEmpresa) {
		this.siteEmpresa = siteEmpresa;
	}

	/**
	 * @return the telEmpresa
	 */
	public Long getTelEmpresa() {
		return telEmpresa;
	}

	/**
	 * @param telEmpresa the telEmpresa to set
	 */
	public void setTelEmpresa(Long telEmpresa) {
		this.telEmpresa = telEmpresa;
	}

	/**
	 * @return the nomeRepresentante
	 */
	public String getNomeRepresentante() {
		return nomeRepresentante;
	}

	/**
	 * @param nomeRepresentante the nomeRepresentante to set
	 */
	public void setNomeRepresentante(String nomeRepresentante) {
		this.nomeRepresentante = nomeRepresentante;
	}

	/**
	 * @return the emailRepresentante
	 */
	public String getEmailRepresentante() {
		return emailRepresentante;
	}

	/**
	 * @param emailRepresentante the emailRepresentante to set
	 */
	public void setEmailRepresentante(String emailRepresentante) {
		this.emailRepresentante = emailRepresentante;
	}

	/**
	 * @return the hashSenhaRepresentante
	 */
	public String getHashSenhaRepresentante() {
		return hashSenhaRepresentante;
	}

	/**
	 * @param hashSenhaRepresentante the hashSenhaRepresentante to set
	 */
	public void setHashSenhaRepresentante(String hashSenhaRepresentante) {
		this.hashSenhaRepresentante = hashSenhaRepresentante;
	}

	/**
	 * @return the sitEmpresa
	 */
	public String getSitEmpresa() {
		return sitEmpresa;
	}

	/**
	 * @param sitEmpresa the sitEmpresa to set
	 */
	public void setSitEmpresa(String sitEmpresa) {
		this.sitEmpresa = sitEmpresa;
	}

	/**
	 * @return the datInclEmpr
	 */
	public Date getDatInclEmpr() {
		return datInclEmpr;
	}

	/**
	 * @param datInclEmpr the datInclEmpr to set
	 */
	public void setDatInclEmpr(Date datInclEmpr) {
		this.datInclEmpr = datInclEmpr;
	}

	/**
	 * @return the motoristas
	 */
	public List<MotoristaEntidade> getMotoristas() {
		return motoristas;
	}

	/**
	 * @param motoristas the motoristas to set
	 */
	public void setMotoristas(List<MotoristaEntidade> motoristas) {
		this.motoristas = motoristas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpresaEntidade [id=" + id + ", razaoSocial=" + razaoSocial
				+ ", cnpj=" + cnpj + ", emailEmpresa=" + emailEmpresa
				+ ", siteEmpresa=" + siteEmpresa + ", telEmpresa=" + telEmpresa
				+ ", nomeRepresentante=" + nomeRepresentante
				+ ", emailRepresentante=" + emailRepresentante
				+ ", hashSenhaRepresentante=" + hashSenhaRepresentante
				+ ", sitEmpresa=" + sitEmpresa + ", datInclEmpr=" + datInclEmpr
				+ ", motoristas=" + motoristas + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result
				+ ((datInclEmpr == null) ? 0 : datInclEmpr.hashCode());
		result = prime * result
				+ ((emailEmpresa == null) ? 0 : emailEmpresa.hashCode());
		result = prime
				* result
				+ ((emailRepresentante == null) ? 0 : emailRepresentante
						.hashCode());
		result = prime
				* result
				+ ((hashSenhaRepresentante == null) ? 0
						: hashSenhaRepresentante.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((motoristas == null) ? 0 : motoristas.hashCode());
		result = prime
				* result
				+ ((nomeRepresentante == null) ? 0 : nomeRepresentante
						.hashCode());
		result = prime * result
				+ ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result
				+ ((sitEmpresa == null) ? 0 : sitEmpresa.hashCode());
		result = prime * result
				+ ((siteEmpresa == null) ? 0 : siteEmpresa.hashCode());
		result = prime * result
				+ ((telEmpresa == null) ? 0 : telEmpresa.hashCode());
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
		EmpresaEntidade other = (EmpresaEntidade) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (datInclEmpr == null) {
			if (other.datInclEmpr != null)
				return false;
		} else if (!datInclEmpr.equals(other.datInclEmpr))
			return false;
		if (emailEmpresa == null) {
			if (other.emailEmpresa != null)
				return false;
		} else if (!emailEmpresa.equals(other.emailEmpresa))
			return false;
		if (emailRepresentante == null) {
			if (other.emailRepresentante != null)
				return false;
		} else if (!emailRepresentante.equals(other.emailRepresentante))
			return false;
		if (hashSenhaRepresentante == null) {
			if (other.hashSenhaRepresentante != null)
				return false;
		} else if (!hashSenhaRepresentante.equals(other.hashSenhaRepresentante))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motoristas == null) {
			if (other.motoristas != null)
				return false;
		} else if (!motoristas.equals(other.motoristas))
			return false;
		if (nomeRepresentante == null) {
			if (other.nomeRepresentante != null)
				return false;
		} else if (!nomeRepresentante.equals(other.nomeRepresentante))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (sitEmpresa == null) {
			if (other.sitEmpresa != null)
				return false;
		} else if (!sitEmpresa.equals(other.sitEmpresa))
			return false;
		if (siteEmpresa == null) {
			if (other.siteEmpresa != null)
				return false;
		} else if (!siteEmpresa.equals(other.siteEmpresa))
			return false;
		if (telEmpresa == null) {
			if (other.telEmpresa != null)
				return false;
		} else if (!telEmpresa.equals(other.telEmpresa))
			return false;
		return true;
	}
	
	

}
