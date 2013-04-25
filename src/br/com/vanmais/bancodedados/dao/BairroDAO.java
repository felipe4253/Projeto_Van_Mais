/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.BairroEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class BairroDAO extends DAOGenerico<BairroEntidade, Long>{

	public BairroDAO(Session sessao) {
		super(sessao);
	}

}
