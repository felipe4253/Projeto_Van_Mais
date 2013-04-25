/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.CidadeEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class CidadeDAO extends DAOGenerico<CidadeEntidade, Long>{

	public CidadeDAO(Session sessao) {
		super(sessao);
	}

}
