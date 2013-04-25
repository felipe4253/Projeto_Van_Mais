/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.TipoVeiculoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class TipoVeiculoDAO extends DAOGenerico<TipoVeiculoEntidade, Long>
{

	public TipoVeiculoDAO(Session sessao) {
		super(sessao);
	}
	
}
