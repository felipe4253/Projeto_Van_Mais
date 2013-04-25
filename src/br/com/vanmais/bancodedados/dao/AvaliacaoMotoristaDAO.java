/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.AvaliacaoMotoristaEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class AvaliacaoMotoristaDAO extends DAOGenerico<AvaliacaoMotoristaEntidade, Long>{

	public AvaliacaoMotoristaDAO(Session sessao) {
		super(sessao);
	}
	
}
