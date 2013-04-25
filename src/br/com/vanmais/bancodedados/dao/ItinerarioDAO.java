/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.ItinerarioEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class ItinerarioDAO extends DAOGenerico<ItinerarioEntidade, Long>{

	public ItinerarioDAO(Session sessao) {
		super(sessao);
	}
	
}
