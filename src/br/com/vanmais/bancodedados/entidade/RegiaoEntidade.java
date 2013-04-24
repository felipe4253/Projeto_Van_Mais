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
@Table(name="regiao")
public class RegiaoEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codRegiao;
	
	@Column(name="desc_regiao")
	private String descRegiao;
	
	@OneToMany(mappedBy="regiao", fetch=FetchType.LAZY)
	private List<BairroEntidade> bairros;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_cidade", nullable=false)
	private CidadeEntidade cidade;

	public Long getCodRegiao() {
		return codRegiao;
	}

	public void setCodRegiao(Long codRegiao) {
		this.codRegiao = codRegiao;
	}

	public String getDescRegiao() {
		return descRegiao;
	}

	public void setDescRegiao(String descRegiao) {
		this.descRegiao = descRegiao;
	}

	public List<BairroEntidade> getBairros() {
		return bairros;
	}

	public void setBairros(List<BairroEntidade> bairros) {
		this.bairros = bairros;
	}

	public CidadeEntidade getCidade() {
		return cidade;
	}

	public void setCidade(CidadeEntidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "RegiaoEntidade [codRegiao=" + codRegiao + ", descRegiao="
				+ descRegiao + ", bairros=" + bairros + ", cidade=" + cidade
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairros == null) ? 0 : bairros.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result
				+ ((codRegiao == null) ? 0 : codRegiao.hashCode());
		result = prime * result
				+ ((descRegiao == null) ? 0 : descRegiao.hashCode());
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
		RegiaoEntidade other = (RegiaoEntidade) obj;
		if (bairros == null) {
			if (other.bairros != null)
				return false;
		} else if (!bairros.equals(other.bairros))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (codRegiao == null) {
			if (other.codRegiao != null)
				return false;
		} else if (!codRegiao.equals(other.codRegiao))
			return false;
		if (descRegiao == null) {
			if (other.descRegiao != null)
				return false;
		} else if (!descRegiao.equals(other.descRegiao))
			return false;
		return true;
	}

		
}
