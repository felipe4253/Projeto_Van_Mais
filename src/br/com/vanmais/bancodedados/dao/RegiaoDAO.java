/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.RegiaoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class RegiaoDAO extends DAOGenerico<RegiaoEntidade, Long>{

	public RegiaoDAO(Session sessao) {
		super(sessao);
	}

}
