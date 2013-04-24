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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
@Entity
@Table(name="motorista")
public class MotoristaEntidade {
	
	//ATRIBUTOS DA TABELA
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_mot")
	private Long codMotorista;
	
	@Column(name="cpf_mot", unique=true, nullable=false)
	private String cpf;
	
	@Column(name="nome_mot", nullable=false)
	private String nome;
	
	@Column(name="tel_mot")
	private Long telMotorista;
	
	@Column(name="cel_mot")
	private Long celMotorista;
	
	@Column(name="email_mot", unique=true)
	private String emailMotorista;
	
	@Column(name="hash_senha")
	private String hashSenha;
	
	@Column(name="sit_mot", nullable=true, columnDefinition="varchar(255) default 'ATIVO'")
	private String sitMotorista;
	
	//RELACIONAMENTO COM OUTRAS TABELAS
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="cod_empr")
	private EmpresaEntidade empresa;
	
	@OneToMany(mappedBy="motorista", fetch = FetchType.LAZY)
	private List<AvaliacaoMotoristaEntidade> avaliacoes;
	
	@OneToMany(mappedBy="motorista", fetch=FetchType.EAGER)
	private List<ItinerarioEntidade> itinerarios;
	
	@OneToMany(mappedBy="motorista", fetch=FetchType.LAZY)
	private List<VeiculoEntidade> veiculos;

	public Long getCodMotorista() {
		return codMotorista;
	}

	public void setCodMotorista(Long codMotorista) {
		this.codMotorista = codMotorista;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelMotorista() {
		return telMotorista;
	}

	public void setTelMotorista(Long telMotorista) {
		this.telMotorista = telMotorista;
	}

	public Long getCelMotorista() {
		return celMotorista;
	}

	public void setCelMotorista(Long celMotorista) {
		this.celMotorista = celMotorista;
	}

	public String getEmailMotorista() {
		return emailMotorista;
	}

	public void setEmailMotorista(String emailMotorista) {
		this.emailMotorista = emailMotorista;
	}

	public String getHashSenha() {
		return hashSenha;
	}

	public void setHashSenha(String hashSenha) {
		this.hashSenha = hashSenha;
	}

	public String getSitMotorista() {
		return sitMotorista;
	}

	public void setSitMotorista(String sitMotorista) {
		this.sitMotorista = sitMotorista;
	}

	public EmpresaEntidade getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaEntidade empresa) {
		this.empresa = empresa;
	}

	public List<AvaliacaoMotoristaEntidade> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<AvaliacaoMotoristaEntidade> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public List<ItinerarioEntidade> getItinerarios() {
		return itinerarios;
	}

	public void setItinerarios(List<ItinerarioEntidade> itinerarios) {
		this.itinerarios = itinerarios;
	}

	public List<VeiculoEntidade> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<VeiculoEntidade> veiculos) {
		this.veiculos = veiculos;
	}

	@Override
	public String toString() {
		return "MotoristaEntidade [codMotorista=" + codMotorista + ", cpf="
				+ cpf + ", nome=" + nome + ", telMotorista=" + telMotorista
				+ ", celMotorista=" + celMotorista + ", emailMotorista="
				+ emailMotorista + ", hashSenha=" + hashSenha
				+ ", sitMotorista=" + sitMotorista + ", empresa=" + empresa
				+ ", avaliacoes=" + avaliacoes + ", itinerarios=" + itinerarios
				+ ", veiculos=" + veiculos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((avaliacoes == null) ? 0 : avaliacoes.hashCode());
		result = prime * result
				+ ((celMotorista == null) ? 0 : celMotorista.hashCode());
		result = prime * result
				+ ((codMotorista == null) ? 0 : codMotorista.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((emailMotorista == null) ? 0 : emailMotorista.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((hashSenha == null) ? 0 : hashSenha.hashCode());
		result = prime * result
				+ ((itinerarios == null) ? 0 : itinerarios.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((sitMotorista == null) ? 0 : sitMotorista.hashCode());
		result = prime * result
				+ ((telMotorista == null) ? 0 : telMotorista.hashCode());
		result = prime * result
				+ ((veiculos == null) ? 0 : veiculos.hashCode());
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
		MotoristaEntidade other = (MotoristaEntidade) obj;
		if (avaliacoes == null) {
			if (other.avaliacoes != null)
				return false;
		} else if (!avaliacoes.equals(other.avaliacoes))
			return false;
		if (celMotorista == null) {
			if (other.celMotorista != null)
				return false;
		} else if (!celMotorista.equals(other.celMotorista))
			return false;
		if (codMotorista == null) {
			if (other.codMotorista != null)
				return false;
		} else if (!codMotorista.equals(other.codMotorista))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (emailMotorista == null) {
			if (other.emailMotorista != null)
				return false;
		} else if (!emailMotorista.equals(other.emailMotorista))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (hashSenha == null) {
			if (other.hashSenha != null)
				return false;
		} else if (!hashSenha.equals(other.hashSenha))
			return false;
		if (itinerarios == null) {
			if (other.itinerarios != null)
				return false;
		} else if (!itinerarios.equals(other.itinerarios))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sitMotorista == null) {
			if (other.sitMotorista != null)
				return false;
		} else if (!sitMotorista.equals(other.sitMotorista))
			return false;
		if (telMotorista == null) {
			if (other.telMotorista != null)
				return false;
		} else if (!telMotorista.equals(other.telMotorista))
			return false;
		if (veiculos == null) {
			if (other.veiculos != null)
				return false;
		} else if (!veiculos.equals(other.veiculos))
			return false;
		return true;
	}

		
}
