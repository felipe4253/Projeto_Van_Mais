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
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cod_tipo_inst", nullable=false)
	private TipoInstituicaoEntidade tipoInstituicao;
	
	//TODO Referenciar a entidade Bairro Entidade
	
}
