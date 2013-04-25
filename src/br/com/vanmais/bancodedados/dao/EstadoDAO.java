/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.EstadoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class EstadoDAO extends DAOGenerico<EstadoEntidade, Long>{

	public EstadoDAO(Session sessao) {
		super(sessao);
	}
	

}
