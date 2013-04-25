/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.InstituicaoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class InstituicaoDAO extends DAOGenerico<InstituicaoEntidade, Long>{

	public InstituicaoDAO(Session sessao) {
		super(sessao);
	}
	
}
