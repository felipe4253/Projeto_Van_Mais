/**
 * 
 */
package br.com.vanmais.bancodedados.dao;

import org.hibernate.Session;

import br.com.vanmais.bancodedados.entidade.VeiculoEntidade;
import br.com.vanmais.bancodedados.util.dao.DAOGenerico;

/**
 * @author Felipe Silva (felipe4253@gmail.com)
 *
 */
public class VeiculoDAO extends DAOGenerico<VeiculoEntidade, Long>
{

	public VeiculoDAO(Session sessao) {
		super(sessao);
		
	}
	
}
