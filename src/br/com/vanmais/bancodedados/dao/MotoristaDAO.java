/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.MotoristaEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class MotoristaDAO extends DAOGenerico<MotoristaEntidade, Long> {

	public MotoristaDAO(Session sessao) {
		super(sessao);
	}

}
