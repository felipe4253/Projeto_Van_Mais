/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.TurnoItinerarioEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author <a href = "mailto:felipe4253@gmail.com">Felipe Silva</a>
 *
 */
public class TurnoItinerarioDAO extends DAOGenerico<TurnoItinerarioEntidade, Long>{
	
	public TurnoItinerarioDAO(Session sessao) {
		super(sessao);
	}
	
	
}
